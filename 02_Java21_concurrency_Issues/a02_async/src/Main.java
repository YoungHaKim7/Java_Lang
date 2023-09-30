import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.CompletableFuture;

public class Main {
    private static final HttpClient httpClient = HttpClient.newBuilder().build();
    private static final ExecutorService executorService = Executors.newFixedThreadPool(5);

    public static void main(String[] args) {
        System.out.println("Active Threads " + Thread.activeCount());

        CompletableFuture[] futures = new CompletableFuture[128];
        for (int i = 0; i < 128; ++i) {
            futures[i] = httpClient.sendAsync(HttpRequest.newBuilder()
                    .uri(URI.create("https://hub.dummyapis.com/delay?seconds=5"))
                    .GET()
                    .build(), BodyHandlers.discarding());
        }

        // Wait for all requests to complete
        CompletableFuture.allOf(futures).join();

        System.out.println("Active Threads " + Thread.activeCount());
    }
}