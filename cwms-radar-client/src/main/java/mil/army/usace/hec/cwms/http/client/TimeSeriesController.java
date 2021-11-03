/*
 * Copyright (c) 2021
 * United States Army Corps of Engineers - Hydrologic Engineering Center (USACE/HEC)
 * All Rights Reserved.  USACE PROPRIETARY/CONFIDENTIAL.
 * Source may not be released without written approval from HEC
 */

package mil.army.usace.hec.cwms.http.client;

import com.fasterxml.jackson.core.json.JsonReadFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import mil.army.usace.hec.cwms.http.client.model.TimeSeries;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public final class TimeSeriesController {

    private final ObjectMapper objectMapper = new ObjectMapper()
        .configure(JsonReadFeature.ALLOW_UNESCAPED_CONTROL_CHARS.mappedFeature(), true);

    public List<TimeSeries> retrieveLocations(HttpUrlProvider radarUrlProvider, String locationQuery, String officeQuery, String units, String datum) throws IOException {
        OkHttpClient client = OkHttpUtil.getClient();
        HttpUrl url = radarUrlProvider.buildHttpUrl("/locations")
            .newBuilder()
            .addQueryParameter("locations", locationQuery)
            .addQueryParameter("office", officeQuery)
            .addQueryParameter("unit", units)
            .addQueryParameter("datum", datum)
            .addQueryParameter("format", "json")
            .build();
        Request build = new Request.Builder()
            .url(url)
            .build();
        Response execute = client.newCall(build).execute();
        String string = execute.body().string();
        return new ArrayList<>();
    }
}