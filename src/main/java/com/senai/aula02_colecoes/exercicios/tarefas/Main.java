package com.senai.aula02_colecoes.exercicios.tarefas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Tarefas listaTarefas = new Tarefas("");
        Scanner scanner = new Scanner(System.in);
         //Tarefas tarefas1 = new Tarefas("nome",true);

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
                 case 3:
                     /*int resposta = scanner.nextInt();
                     for (int i = 0; i < listaTarefas.size(); i++) {
                         listaTarefas.set(resposta,new Tarefas());
                     }*/

                     break;
                 case 4:
                     /*System.out.println("Qual tarefa deseja excluir?");
                     for (Tarefas listaTarefa : listaTarefas) {
                         System.out.println(listaTarefa.nomeTarefa);
                     }
                     int resposta = scanner.nextInt();
                     for (int i = 0; i < listaTarefas.size(); i++) {
                         listaTarefas.remove(resposta);
                     }
                     break;*/
                 case 5:
                     System.out.println("Encerrando o programa...");
             }
         }while (opcao != 5);




    }
}
