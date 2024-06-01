package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.models.Titulos;

public class CalculadoraDeTempo {
    private int tempoDeMaratona;

    public int getTempoDeMaratona(){
        return tempoDeMaratona;
    }

    public void incluir(Titulos titulo){
        tempoDeMaratona += titulo.getDuracaoEmMinutos();
    }


}
