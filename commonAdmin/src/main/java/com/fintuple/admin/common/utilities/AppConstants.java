package com.fintuple.admin.common.utilities;

import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;

import java.util.HashMap;
import java.util.Map;

public class AppConstants {
    public static final String SUCCESS = "SUCCESS";
    public static final String SUCCESS_MSG = "SUCCESS1";

    public static Map<String, String> getHeaders() {
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
        headers.put("X-Custom-Header", "application/json");
        return headers;
    }

    public static APIGatewayProxyResponseEvent baseResponse = new APIGatewayProxyResponseEvent()
            .withHeaders(getHeaders()).withStatusCode(200);

}

