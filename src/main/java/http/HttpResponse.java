package http;

import java.io.OutputStream;
import java.util.HashMap;

public class HttpResponse {
    private final OutputStream os;
    private HashMap<String, String> headers;

    public HttpResponse(OutputStream out) {
        this.os = out;
    }

    public void forward() {

    }

    public void sendRedirect() {

    }

    public void addHeader(String property, String value) {
        headers.put(property, value);
    }
}
