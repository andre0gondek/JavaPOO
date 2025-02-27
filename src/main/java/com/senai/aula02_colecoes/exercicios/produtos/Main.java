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
                    deletarProduto();
                    break;
                case 5:
                    buscarProduto();
                    break;
                case 6:
                    System.out.println("Encerrando o programa...");
                default:
                    System.out.println("Insira uma opção válida");
            }
        } while (opcao != 6);
    }

    //CRUD funções
    public static void cadastrarProduto() {
        System.out.print("Digite o nome do produto que deseja adicionar:");
        String nome = scanner.nextLine();
        System.out.print("Digite a quantidade do produto em estoque:");
        int qtd = scanner.nextInt();
        cadastroProtudos.add(new Produtos(nome, qtd));
    }

    public static void listarProduto() {
        System.out.println("--Lista--");
        cadastroProtudos.forEach(System.out::println);
        }

    public static void atualizarProduto(){
            System.out.println("Qual produto você deseja atualizar?");
            listarProduto();
            int resposta = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Digite o novo nome do produto para confirmar: ");
            String novoNome = scanner.nextLine();
            System.out.print("Digite a nova quantidade: ");
            int novaQtd = scanner.nextInt();
            cadastroProtudos.set(resposta, new Produtos(novoNome, novaQtd));
        }
    public static void deletarProduto(){
        System.out.println("Qual produto você deseja deletar?");
        listarProduto();
        int resposta = scanner.nextInt();
        cadastroProtudos.remove(resposta);
    }

    public static void buscarProduto() {
        System.out.print("Digite o nome do produto que deseja buscar: ");
        String nomeDigitado = scanner.nextLine();
        List<Produtos> buscarProduto = cadastroProtudos.stream().filter(p -> p.nomeProduto.contains(nomeDigitado)).toList();
        buscarProduto.forEach(System.out::println);
    }
}