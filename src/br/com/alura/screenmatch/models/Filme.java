package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Filme extends Titulos implements Classificavel {

    public Filme(String nome, int anoDeLancamento){
        this.setNome(nome);
        this.setAnoDeLancamento(anoDeLancamento);
    }

    @Override
    public int getClassificacao(){
        return exibirMediaNota()/2;
    }

}
