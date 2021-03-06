package example;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class GetTimeServer {

    private static final int PORT = 50051;
    private Server server;

    public void start() throws IOException {
        server = ServerBuilder.forPort(PORT)
                .addService(new GetTimeServiceImpl())
                .build()
                .start();
    }

    public void blockUntilShutdown() throws InterruptedException {
        if (server == null) {
            return;
        }

        server.awaitTermination();
    }

    public static void main(String[] args)
            throws InterruptedException,    IOException {
        GetTimeServer server = new GetTimeServer();
        server.start();
        System.out.println("STARTED!");
        server.blockUntilShutdown();
    }
}
