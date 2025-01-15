package string.manipulations;

import java.util.*;

public class UrlParameters {

    public String stripUrlParams(String url, String[] paramsToStrip) {
        // Split the URL into base and query part
        String[] urlParts = url.split("\\?");
        String baseUrl = urlParts[0];

        if (urlParts.length == 1) {
            // No query parameters present
            return baseUrl;
        }

        Map<String, String> paramMap = getStringStringMap(paramsToStrip, urlParts);

        // Reconstruct the query string
        StringBuilder resultQuery = new StringBuilder();
        for (Map.Entry<String, String> entry : paramMap.entrySet()) {
            if (!resultQuery.isEmpty()) {
                resultQuery.append("&");
            }
            resultQuery.append(entry.getKey()).append("=").append(entry.getValue());
        }

        return !resultQuery.isEmpty() ? baseUrl + "?" + resultQuery : baseUrl;
    }

    private Map<String, String> getStringStringMap(String[] paramsToStrip, String[] urlParts) {
        String query = urlParts[1];
        String[] queryParams = query.split("&");

        // Use LinkedHashMap to maintain insertion order and uniqueness
        Map<String, String> paramMap = new LinkedHashMap<>();

        for (String param : queryParams) {
            String[] keyValue = param.split("=");
            if (keyValue.length == 2) {
                paramMap.put(keyValue[0], keyValue[1]);
            }
        }

        // If paramsToStrip is provided, remove those parameters
        if (paramsToStrip != null) {
            for (String param : paramsToStrip) {
                paramMap.remove(param);
            }
        }
        return paramMap;
    }

    public String stripUrlParams(String url) {
        return stripUrlParams(url, null);
    }

}

