import com.google.gson.*;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultadeAPI {
    public CalculoDeCambio obtenernjson (float cantidad, String nombre,int ruta) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/f7fdcfd9ea1eb5ec7eaeecd0/latest/USD"))
                .build();
        try{
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();
            JsonElement jsonElement = JsonParser.parseString(json);
            JsonObject jsonObject = jsonElement.getAsJsonObject();
            JsonElement conversiones = jsonObject.get("conversion_rates");
            JsonObject monedas = conversiones.getAsJsonObject();
            Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                    .setPrettyPrinting().create();
            ObtenerValores matrisPaises = gson.fromJson(monedas, ObtenerValores.class);

            return new CalculoDeCambio(matrisPaises, cantidad,nombre,ruta);
        }catch (Exception e){
            throw new RuntimeException("NO HAY DATOS");
        }
    }
}
