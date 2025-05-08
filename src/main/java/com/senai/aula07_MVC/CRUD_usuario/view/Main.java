package com.senai.aula07_MVC.CRUD_usuario.view;

import com.senai.aula07_MVC.CRUD_usuario.controler.OperadorController;
import com.senai.aula07_MVC.CRUD_usuario.controler.SupervisorController;
import com.senai.aula07_MVC.CRUD_usuario.model.Operador;
import com.senai.aula07_MVC.CRUD_usuario.model.Supervisor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OperadorController opController = new OperadorController();
        SupervisorController supController = new SupervisorController();

        System.out.println("--Cadastro de Produtos--");
        String menu = """
                ______________________________
                |1. Cadastrar Usuario        |
                |2. Deletar Usuario          |
                |3. Atualizar Usuario        |
                |4. Exibir Usuario           |
                |5. Ligar máquina            |
                |6. Demitir Operador         |
                |7. Sair                     |
                |____________________________|
               """;

        int opcao;
        do {
            System.out.println(menu);
            opcao = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Qual o tipo de Usuário?");
            System.out.println("1 - Operador");
            System.out.println("2 - Supervisor");
            int escolhaTipo = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    System.out.println("Preencha os dados a seguir: ");
                    System.out.println("ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Nome: ");
                    String nome = scanner.nextLine();

                    if (escolhaTipo == 1) {
                        System.out.println("Setor: ");
                        String setor = scanner.nextLine();
                        Operador operador = new Operador(nome, id, setor);
                        if (opController.cadastrarOperador(operador))
                        {
                            System.out.println("Cadastrado com sucesso!");
                        } else {
                            System.out.println("Não foi possível cadastrar.");
                        }
                    } else if (escolhaTipo == 2) {
                        System.out.println("Area: ");
                        String area = scanner.nextLine();
                        Supervisor supervisor = new Supervisor(nome, id, area);
                        if (supController.cadastrarSupervisor(supervisor))

                        {
                            System.out.println("Cadastrado com sucesso!");
                        } else {
                            System.out.println("Não foi possível cadastrar.");
                        }
                    }
                    break;
                case 2:
                    if (escolhaTipo == 1) {
                        opController.listarOperadores().forEach(System.out::println);

                    }else if(escolhaTipo == 2) {
                        supController.listarSupervisores().forEach(System.out::println);
                    }
                    System.out.print("Escolha um usuario pelo ID para deletar: ");
                    id = scanner.nextInt();
                    scanner.nextLine();

                    if (escolhaTipo == 1)
                        opController.deletarOperador(id);
                    else if (escolhaTipo == 2)
                        supController.deletarSupervisor(id);
                    break;
                case 3:
                    if (escolhaTipo == 1) {
                        opController.listarOperadores().forEach(System.out::println);

                    }else if(escolhaTipo == 2) {
                        supController.listarSupervisores().forEach(System.out::println);
                    }
                    System.out.print("Escolha um usuario pelo ID para atualizar: ");
                    id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Atualize as informações: ");
                    System.out.print("Nome: ");
                    nome = scanner.nextLine();

                    if (escolhaTipo == 1) {
                        System.out.print("Setor: ");
                        String setor = scanner.nextLine();
                    Operador operador = new Operador(nome, id, setor);
                    opController.atualizarOperador(operador);
                    } else if (escolhaTipo == 2) {
                        System.out.print("Area: ");
                        String area = scanner.nextLine();
                    Supervisor supervisor = new Supervisor(nome, id, area);
                    supController.atualizarSupervisor(supervisor);
                    }
                    System.out.println("Usuário atualizado com sucesso!");
                    break;
                case 4:
                    if (escolhaTipo == 1) {
                        opController.listarOperadores().forEach(System.out::println);

                    }else if(escolhaTipo == 2) {
                        supController.listarSupervisores().forEach(System.out::println);
                    }
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    System.out.println("Encerrando o programa...");
                    scanner.close();
                    break;
                default:
                    System.out.println("Insira uma opção válida.");
                    break;
            }
        } while (opcao != 7);
    }
}
