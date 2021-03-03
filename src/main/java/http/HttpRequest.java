package http;

import java.io.InputStream;
import java.util.HashMap;

public class HttpRequest {
    private final InputStream is;
    private HashMap<String, String> params;
    private HashMap<String, String> headers;
    private String method;
    private String path;

    public HttpRequest(InputStream in) {
        is = in;
    }

    public String getMethod() {
        return method;
    }

    public String getPath() {
        return path;
    }

    public String getHeader(String property) {
        return headers.get(property);
    }

    public String getParameter(String property) {
        return params.get(property);
    }
}
