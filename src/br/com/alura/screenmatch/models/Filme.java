package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Filme extends Titulos implements Classificavel {

    @Override
    public int getClassificacao(){
        return exibirMediaNota()/2;
    }

}
