import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Cambios {

    public Divisas cambioDivisa(String divisaBase){

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/a2ec0d83e89263ad16cf309b/latest/"+ divisaBase);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Divisas.class);
        } catch (Exception e) {
            throw new RuntimeException("No encontré esa Divisa.");
        }
    }

}
