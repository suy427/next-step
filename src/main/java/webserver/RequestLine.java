package webserver;

import http.HttpMethod;

public class RequestLine {
    private String path;
    private HttpMethod method;

    public String getMethod() {
        return method.toString();
    }

    public String getPath() {
        return path;
    }
}
