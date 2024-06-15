package br.com.alura.screenmatch.web;

import br.com.alura.screenmatch.models.Titulos;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class BuscaOmdb {

    public Titulos fazerRequisicaoOmdb(String busca) throws IOException, InterruptedException {
        Chaves chave = new Chaves();
        Transformador transformador = new Transformador();
        String endereco = "http://www.omdbapi.com/?t=" + busca.replaceAll(" ", "+") + "&apikey=" + chave.getOMDB_KEY();
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return transformador.jsonToTitulo(response);
    }

}
