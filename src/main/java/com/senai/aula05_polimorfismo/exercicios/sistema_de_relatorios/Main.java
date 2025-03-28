package com.senai.aula05_polimorfismo.exercicios.sistema_de_relatorios;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerarJSON arquivoJson = new GerarJSON(new File("src\\main\\java\\com\\senai\\aula05_polimorfismo\\exercicios\\sistema_de_relatorios\\relatorios\\relatorio.json"));
        GerarPDF arquivoPdf = new GerarPDF(new File("src\\main\\java\\com\\senai\\aula05_polimorfismo\\exercicios\\sistema_de_relatorios\\relatorios\\relatorio.pdf"));
        GerarCSV arquivoCsv = new GerarCSV(new File("src\\main\\java\\com\\senai\\aula05_polimorfismo\\exercicios\\sistema_de_relatorios\\relatorios\\relatorio.csv"));

        System.out.println("Deseja deletar os arquivos para gerar novamente? (s/n)");
        String escolha = scanner.nextLine();
        if (escolha.equals("s".toLowerCase())) {
            arquivoCsv.deletar();
            arquivoJson.deletar();
            arquivoPdf.deletar();
            System.out.println("Arquivos deletados com sucesso!");
        } else if (escolha.equals("n".toLowerCase())){
            System.out.println("");
        }

        System.out.println("Deseja gerar os arquivos novamente?");
        escolha = scanner.nextLine();
        if (escolha.equals("s".toLowerCase())) {
            arquivoCsv.gerar();
            arquivoJson.gerar();
            arquivoPdf.gerar();
        } else if (escolha.equals("n".toLowerCase())){System.out.println("Encerrando programa...");}
    }
}
