package com.senai.aula04_heranca.exercicios.sistema_de_bibliotecas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //fisicos
        LivroFisico fisico1 = new LivroFisico("Michael Crichton", "Jurassic Park", 472);
        LivroFisico fisico2 = new LivroFisico("Machado de Assis", "Dom Casmurro", 230);
        LivroFisico fisico3 = new LivroFisico("Peter Benchley", "Tubarão", 280);

        //digitais
        LivroDigital digital1 = new LivroDigital("Michael Crichton", "Jurassic Park", 397.8);
        LivroDigital digital2 = new LivroDigital("Machado de Assis", "Dom Casmurro", 157.9);
        LivroDigital digital3 = new LivroDigital("Peter Benchley", "Tubarão", 284.5);

        ArrayList<LivroFisico> listaFisica = new ArrayList<>();
        listaFisica.add(fisico1);
        listaFisica.add(fisico2);
        listaFisica.add(fisico3);

        ArrayList<LivroDigital> listaDigital = new ArrayList<>();
        listaDigital.add(digital1);
        listaDigital.add(digital2);
        listaDigital.add(digital3);

        System.out.println("--Selecione uma de nossas bibliotecas--");
        String menu = """
                ______________________________
                |1. Biblioteca Física        |
                |2. Biblioteca Digital       |
                |3. Fechar Biblioteca        |
                |____________________________|
                """;

        int opcao;
        do {
            System.out.println(menu);
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    listaFisica.forEach(LivroFisico::exibirDados);
                    break;
                case 2:
                    listaDigital.forEach(LivroDigital::exibirDados);
                    break;
                case 3:
                    System.out.println("Encerrando Biblioteca...");
                default:
                    System.out.println("Insira uma opção válida.");
            }
        } while (opcao != 3);
    }
}
