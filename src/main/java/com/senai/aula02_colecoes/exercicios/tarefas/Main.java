package com.senai.aula02_colecoes.exercicios.tarefas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tarefas listaTarefas = new Tarefas("", false);
        Scanner scanner = new Scanner(System.in);

        System.out.println("--Gerenciador de tarefas--");
        String menu = """
                ______________________________
                |1. Adicionar Tarefa         |
                |2. Listar tarefas           |
                |3. Marcar como concluída    |
                |4.Remover Tarefa            |
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
                    System.out.print("Digite o nome da tarefa: ");
                    String nome = scanner.nextLine();
                    listaTarefas.criarTarefa(nome);
                    break;
                case 2:
                    listaTarefas.lerTarefas();
                    break;
                case 3:

                    System.out.println("Qual tarefa você deseja atualizar?");
                    listaTarefas.lerTarefas();
                    int resposta = scanner.nextInt();
                    Tarefas tarefa = listaTarefas.listaTarefas.get(resposta);
                    tarefa.atualizarTarefa();
                    System.out.println("Tarefa atualizada com sucesso!");
                    break;
                case 4:
                    System.out.println("Qual tarefa deseja excluir?");
                    listaTarefas.lerTarefas();
                    int respostaDel = scanner.nextInt();
                    listaTarefas.deletarTarefa(respostaDel);
                    break;
                case 5:
                    System.out.println("Encerrando o programa...");
                default:
                    System.out.println("Insira uma opção válida");
            }
        } while (opcao != 5);
    }
}
