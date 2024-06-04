package br.com.alura.screenmatch.models;


public class Titulos {
    private String nome;
    private String diretor;
    private int anoDeLancamento;
    private int duracaoEmMinutos;
    private boolean incluidoNoPlano;
    private int avaliacoes;
    private int totalDeAvaliacoes;


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDiretor(String diretor){
        this.diretor = diretor;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public String getNome() {
        return nome;
    }

    public String getDiretor(){
        return diretor;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }
    

    public void exibirDadosTitulo(){
        System.out.println("Nome do Título: " + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
    }

    public void avaliar(int nota){
        avaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public int exibirMediaNota(){
        return avaliacoes/totalDeAvaliacoes;
    }

    @Override
    public String toString() {
        return getNome() + " (" + getAnoDeLancamento() + ")";
    }

    
}
