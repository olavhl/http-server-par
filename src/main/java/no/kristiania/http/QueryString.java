package no.kristiania.http;

import java.util.HashMap;
import java.util.Map;

public class QueryString {


    private final Map<String, String> parameters = new HashMap<>();

    public QueryString(String queryString) {
        for (String parameter : queryString.split("&")) {
            int equalPos = parameter.indexOf('=');
            String key = parameter.substring(0, equalPos);
            String value = parameter.substring(equalPos+1);
            parameters.put(key, value);
        }
    }

    public String getParameter(String key) {

        return parameters.get(key);
    }

    


}