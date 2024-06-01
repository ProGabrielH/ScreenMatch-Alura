package br.com.alura.screenmatch.calculos;

public class FiltroRecomendacao {
    
    public void filtrar(Classificavel classificavel){
        if (classificavel.getClassificacao() >= 4){
            System.out.println("Esta série está bombando");
        } else if (classificavel.getClassificacao() >= 2){
            System.out.println("Essa série está na média");
        } else { System.out.println("Essa série não está fazendo muito sucesso"); }
    }
}
