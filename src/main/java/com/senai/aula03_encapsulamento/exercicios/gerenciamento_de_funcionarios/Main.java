package com.senai.aula03_encapsulamento.exercicios.gerenciamento_de_funcionarios;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listaCargos = new ArrayList<>();
        listaCargos.set(0, "Gerente");
        listaCargos.set(1, "Analista");
        listaCargos.set(2, "Programar");

        Funcionario funcionario1 = new Funcionario("João");
        Funcionario funcionario2 = new Funcionario("Gabriel");
        Funcionario funcionario3 = new Funcionario("Bruno");


        //alterar salário de funcionários
        System.out.println("Você deseja alterar o salário de algum funcionario?(s/n)");
        String escolha = scanner.nextLine();

        if (Objects.equals(escolha, "s")){
            System.out.println("Qual salario de qual funcionario deseja alterar?\n1-"
                    +funcionario1.getNome() + "\n2-" + funcionario2.getNome() + "\n3-" + funcionario3.getNome());
            int opcaoSalario = scanner.nextInt();
            switch (opcaoSalario){

                case 1: System.out.println("Digite o valor a ser alterado.");
                    double valor = scanner.nextDouble();
                    funcionario1.setSalario(valor);
                    funcionario1.getSalario();
                    break;

                case 2: System.out.println("Digite o valor a ser alterado.");
                    double valor2 = scanner.nextDouble();
                    funcionario2.setSalario(valor2);
                    funcionario2.getSalario();
                    break;

                case 3: System.out.println("Digite o valor a ser alterado.");
                    double valor3 = scanner.nextDouble();
                    funcionario3.setSalario(valor3);
                    funcionario3.getSalario();
                    break;
            }

        } else if (Objects.equals(escolha, "n")){
            System.out.println("Operação finalizada.");
        }
    }
}
