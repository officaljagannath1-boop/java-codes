import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
class Info {
    public static void main(String[] args) {
        String url = "https://api.example.com/info"; // Replace with the actual API endpoint

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("Response status code: " + response.statusCode());
            System.out.println("Response body: " + response.body());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}