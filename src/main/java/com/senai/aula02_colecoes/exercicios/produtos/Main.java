package com.senai.aula02_colecoes.exercicios.produtos;

import com.senai.aula02_colecoes.exemplos.pessoa.Pessoa;
import com.senai.aula02_colecoes.exercicios.tarefas.Tarefas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Produtos> cadastroProtudos = new ArrayList<>();

    public static void main(String[] args) {


        System.out.println("--Cadastro de Produtos--");
        String menu = """
                ______________________________
                |1. Adicionar Produto        |
                |2. Listar Produto           |
                |3. Atualizar Produto        |
                |4. Remover Produto          |
                |5. Buscar Produto           |
                |6. Sair                     |
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
                    atualizarProduto();
                    break;
                case 4:

                    break;
                case 5:
                    System.out.println("Encerrando o programa...");
                default:
                    System.out.println("Insira uma opção válida");
            }
        } while (opcao != 5);
    }

    public static void cadastrarProduto() {
        System.out.println("Digite o nome e a quantidade do produto que deseja adicionar.");
        String nome = scanner.nextLine();
        int qtd = scanner.nextInt();
        cadastroProtudos.add(new Produtos(nome, qtd));
    }

    public static void listarProduto() {
        System.out.println("--Lista--");
        System.out.println(cadastroProtudos.toString());
        }
        public static void atualizarProduto(){
            System.out.println("Qual produto você deseja atualizar?");
            listarProduto();
            int resposta1 = scanner.nextInt();
            System.out.println("Digite a o nome do produto, e a nova quantidade em estoque.");
            String nome = scanner.nextLine();
            int novaQtd = scanner.nextInt();
            cadastroProtudos.set(resposta1, new Produtos(nome,novaQtd));
        }
    }
