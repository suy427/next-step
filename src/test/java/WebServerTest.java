import org.junit.jupiter.api.BeforeAll;
import webserver.WebServer;

public class WebServerTest {
    WebServer server;

    @BeforeAll
    void init() {
        server = new WebServer();

    }
}
