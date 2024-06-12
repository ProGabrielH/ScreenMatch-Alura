package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.models.Episodio;
import br.com.alura.screenmatch.models.Filme;
import br.com.alura.screenmatch.models.Serie;


public class Main {
    public static void main(String[] args) {
        Filme filme1 = new Filme("Django Livre", 2012);
        Serie serie1 = new Serie("Breaking Bad", 2012);

        //filme1.nome = "Django: Unchained";
        //filme1.avaliacoes = 100;
        //filme1.totalDeAvaliacoes = 1;

        //System.out.println(filme1.nome);

        //filme1.setNome("Django Livre");
        //filme1.setAnoDeLancamento(2012);
        filme1.setDuracaoEmMinutos(165);

        //serie1.setNome("Breaking Bad");
        //serie1.setAnoDeLancamento(2012);
        serie1.setMinutosPorEpisodio(45);

        Episodio primeiro = new Episodio(1, "Piloto", serie1);
        //primeiro.setNumero(1);
        //primeiro.setSerie(serie1);
        primeiro.setTotalVizualizacoes(1000);

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtrar(primeiro);

        System.out.println(filme1);
        System.out.println(serie1);
        System.out.println(primeiro);
        
    }
}