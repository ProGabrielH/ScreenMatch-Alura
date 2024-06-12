package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.models.Titulos;
import br.com.alura.screenmatch.models.TitulosOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o filme que deseja buscar: ");
        var busca = scanner.nextLine();
        String chave = "a51477ce";
        String endereco = "http://www.omdbapi.com/?t=" + busca.replaceAll(" ", "+") + "&apikey=" + chave;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());

        System.out.println("Alterando forma de saída com Gson:");

        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
        TitulosOmdb meuTituloOmdb = gson.fromJson(response.body(), TitulosOmdb.class);
        Titulos meuTitulo = new Titulos(meuTituloOmdb);

        System.out.println(meuTitulo);
    }
}
