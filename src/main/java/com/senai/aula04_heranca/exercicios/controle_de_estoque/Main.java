package com.senai.aula04_heranca.exercicios.controle_de_estoque;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Eletronico> listaEletronicos = new ArrayList<>();
    static ArrayList<Alimento> listaAlimentos = new ArrayList<>();
    public static void main(String[] args) {


        System.out.println("--Cadastro de Produtos--");
        String menu = """
                ______________________________
                |1. Adicionar Produto        |
                |2. Listar Produto           |
                |5. Sair                     |
                |____________________________|
                """;

        int opcao;
        do {
            System.out.println(menu);
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    cadastrarProduto();
                    break;
                case 2:
                    listarProduto();
                    break;
                case 3:
                    System.out.println("Encerrando o programa...");
                default:
                    System.out.println("Insira uma opção válida");
            }
        } while (opcao != 3);
    }
    public static void cadastrarProduto(){
        System.out.println("Qual tipo de produto deseja atualizar?\n- Eletrônico \n-Alimento");
        String escolha = scanner.nextLine();
        if (escolha.equals("eletronico".toLowerCase())){
            System.out.print("Digite o nome do produto, o valor, a quantidade e a voltagem, respectivamente: ");
            String nome = scanner.nextLine();
            double valor = scanner.nextDouble();
            int qtd = scanner.nextInt();
            int voltagem = scanner.nextInt();
            listaEletronicos.add(new Eletronico(nome,valor,qtd,voltagem));

        } else if (escolha.equals("alimento".toLowerCase())) {
            System.out.print("Digite o nome do produto, o valor, a quantidade e a data de validade, respectivamente: ");
            String nome = scanner.nextLine();
            double valor = scanner.nextDouble();
            int qtd = scanner.nextInt();
            int validade = scanner.nextInt();
            listaAlimentos.add(new Alimento(nome,valor,qtd,validade));
        } else System.out.println("Insira uma opção entre Eletrônico ou alimento.");
    }
    public static void listarProduto(){
        System.out.println("---Lista Eletrônicos---");
        listaEletronicos.forEach(System.out::println);
        System.out.println("---Lista Alimentos---");
        listaAlimentos.forEach(System.out::println);
    }
}

