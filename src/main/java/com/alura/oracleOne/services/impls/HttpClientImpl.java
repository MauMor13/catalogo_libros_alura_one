package com.alura.oracleOne.services.impls;
import com.alura.oracleOne.services.HttpClientService;
import org.springframework.stereotype.Service;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Service
public class HttpClientImpl implements HttpClientService {

    public String requestStructure(String endUrl){

        //ruta y clave a la api de conversion
        String partialUrl = "gutendex.com/books?";

        //ruta completa
        String urlRequest = partialUrl.concat(endUrl);

        //instancia de cliente para realizar la petición
        HttpClient client = HttpClient.newHttpClient();

        try{
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(urlRequest))
                    .build();
            HttpResponse<String> response = client
                    .sendAsync(request, HttpResponse.BodyHandlers.ofString())
                    .join();
            return response.body();
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        return "";
    }

}
