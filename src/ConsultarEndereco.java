import com.google.gson.Gson;
import model.Endereco;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ConsultarEndereco {

    public Endereco buscarCep(String cep) {
        Scanner scanner = new Scanner(System.in);

        URI endereco = URI.create("https://viacep.com.br/ws/" + cep + "/json/");

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();


        try {
            HttpResponse<String> response = HttpClient
                     .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());

            return new Gson().fromJson(response.body(),Endereco.class);

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Não consegui obter o endereço do cep");
        }



    }

}
