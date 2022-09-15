package mil.army.usace.hec.cwms.http.client;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.logging.HttpLoggingInterceptor;

final class CwmsHttpLogger implements HttpLoggingInterceptor.Logger {

    private static final Logger LOGGER = Logger.getLogger(CwmsHttpLogger.class.getName());
    private static final HttpLoggingInterceptor.Logger DELEGATE = HttpLoggingInterceptor.Logger.DEFAULT;

    @Override
    public void log(String s) {
        if (!s.contains("access_token") && !s.contains("refresh_token")) {
            DELEGATE.log(s);
        } else {
            try {
                s = redactOAuth2Tokens(s);
                DELEGATE.log(s);
            } catch (JsonProcessingException e) {
                LOGGER.log(Level.INFO, () -> "Could not parse logged JSON. Redacting log containing token(s) for security reasons.");
            }
        }
    }

    private String redactOAuth2Tokens(String s) throws JsonProcessingException {
        ObjectMapper om = new ObjectMapper();
        Map<String, String> jsonMap = om.readValue(s, Map.class);
        for (Map.Entry<String, String> entry : jsonMap.entrySet()) {
            String key = entry.getKey();
            if (key.equalsIgnoreCase("access_token") || key.equalsIgnoreCase("refresh_token")) {
                entry.setValue("<REDACTED>");
            }
        }
        return om.writeValueAsString(jsonMap);
    }

}
