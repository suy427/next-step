import http.HttpRequest;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class HttpRequestTest {
    private String testDirectory = "./src/test/resources/";

    @Test
    public void reques_GET() throws Exception {
        InputStream in = new FileInputStream(new File(testDirectory+"Http_GET.txt"));
        HttpRequest request = new HttpRequest(in);

        assertEquals("GET", request.getMethod());
        assertEquals("/user/create", request.getPath());
        assertEquals("keep-alive", request.getHeader("Connection"));
        assertEquals("sondahum", request.getParameter("userId"));
    }
}
