package com.senai.aula03_encapsulamento.exercicios.gerenciamento_de_funcionarios;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> listaCargos = new ArrayList<>();
        listaCargos.add("gerente");
        listaCargos.add("programador");
        listaCargos.add("analista");



        Scanner scanner = new Scanner(System.in);
        Funcionario funcionario1 = new Funcionario("João", 1400.0, "gerente", listaCargos);
        Funcionario funcionario2 = new Funcionario("Gabriel", 5000.0,"programador", listaCargos);
        Funcionario funcionario3 = new Funcionario("Bruno", 50000.7,"analista", listaCargos);


        //alterar salário de funcionários
        System.out.println("Você deseja alterar o salário de algum funcionario?(s/n)");
        String escolha = scanner.nextLine();

        if (Objects.equals(escolha, "s")){
            System.out.println("Qual salario de qual funcionario deseja alterar?\n1-"
                    +funcionario1.getNome() + "\n2-" + funcionario2.getNome() + "\n3-" + funcionario3.getNome());
            int opcaoSalario = scanner.nextInt();
            switch (opcaoSalario){

                case 1: System.out.println("Digite o valor em porcentagem a ser alterado.");
                    int valor = scanner.nextInt();
                    funcionario1.aumentarSalario(valor);
                    funcionario1.getSalario();
                    break;

                case 2: System.out.println("Digite o valor em porcentagem a ser alterado.");
                    int valor2 = scanner.nextInt();
                    funcionario2.aumentarSalario(valor2);
                    funcionario2.getSalario();
                    break;

                case 3: System.out.println("Digite o valor em porcentagem a ser alterado.");
                    int valor3 = scanner.nextInt();
                    funcionario3.aumentarSalario(valor3);
                    funcionario3.getSalario();
                    break;
            }

        } else if (Objects.equals(escolha, "n")){
            System.out.println("Operação finalizada.");
        }
        System.out.println(funcionario1);
        System.out.println(funcionario2);
        System.out.println(funcionario3);
    }
}
