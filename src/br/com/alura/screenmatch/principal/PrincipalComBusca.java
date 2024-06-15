package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.web.BuscaOmdb;

import java.io.IOException;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        BuscaOmdb buscaOmdb = new BuscaOmdb();

        System.out.println("Informe o filme que deseja buscar: ");
        var busca = scanner.nextLine();
        System.out.println(buscaOmdb.fazerRequisicaoOmdb(busca));
        scanner.close();
    }
}
