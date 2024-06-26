package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Episodio implements Classificavel {
    
    private int numero;
    private String nome;
    private Serie serie;
    private int totalVizualizacoes;

    public Episodio(int numero, String nome, Serie serie){
        this.numero = numero;
        this.nome = nome;
        this.serie = serie;
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public int getTotalVizualizacoes() {
        return totalVizualizacoes;
    }

    public void setTotalVizualizacoes(int totalVizualizacoes) {
        this.totalVizualizacoes = totalVizualizacoes;
    }

    @Override
    public int getClassificacao(){
        if (totalVizualizacoes > 100){
            return 4;
        }
        return 2;
    }

    @Override
    public String toString() {
        return numero + "- " + nome + " (" + serie.getNome() + ")";
    }

    

}
