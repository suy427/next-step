package webserver;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;

import java.net.ServerSocket;
import java.net.Socket;

public class WebServer {
    private static final Logger logger = LoggerFactory.getLogger(WebServer.class);
    private static final int DEFAULT_PORT = 8080;

    public static void main(String[] args) {
        int port = 0;

        if (args == null || args.length == 0) {
            port = DEFAULT_PORT;
        } else {
            port = Integer.parseInt(args[0]);
        }

        try(ServerSocket listenSocket = new ServerSocket(port)) {
            logger.debug("Web Server started {} port", port);
            Socket connection;
            while ((connection = listenSocket.accept()) != null) {
                RequestHandler requestHandler =
                        new RequestHandler(connection);
                requestHandler.run();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
