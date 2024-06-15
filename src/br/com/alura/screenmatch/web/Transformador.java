package br.com.alura.screenmatch.web;

import br.com.alura.screenmatch.models.Titulos;
import br.com.alura.screenmatch.models.TitulosOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.net.http.HttpResponse;

public class Transformador {

    public Titulos jsonToTitulo(HttpResponse<String> response){
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
        TitulosOmdb meuTituloOmdb = gson.fromJson(response.body(), TitulosOmdb.class);
        Titulos meuTitulo = new Titulos(meuTituloOmdb);
        return meuTitulo;
    }
}
