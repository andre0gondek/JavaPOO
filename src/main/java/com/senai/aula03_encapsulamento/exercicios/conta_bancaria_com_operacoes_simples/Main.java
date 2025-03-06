package com.senai.aula03_encapsulamento.exercicios.conta_bancaria_com_operacoes_simples;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("Roger", 90.0);
        ContaBancaria conta2 = new ContaBancaria("Rafael",0.0);
        Scanner scanner = new Scanner(System.in);

        System.out.println(conta1);

        int escolha;
            System.out.println("Deseja depositar, sacar ou transferir dinheiro?\n1-Depositar\n2-Sacar\n3-transferir");
            escolha = scanner.nextInt();
            scanner.nextLine();
            if (escolha == 1) {
                System.out.println("Digite o valor a ser depositado: ");
                double valor = scanner.nextDouble();
                conta1.depositar(valor);
            } else if (escolha == 2) {
                System.out.println("Digite o valor a ser sacado: ");
                double valor = scanner.nextDouble();
                conta1.sacar(valor);
            } else if (escolha == 3) {
                System.out.println("Digite o nome titular da conta que deseja transferir.");
                String nome = scanner.nextLine();
                if (nome.equals(conta2)){
                    System.out.println("Digite o valor da transferencia.");
                    int valor = scanner.nextInt();
                    conta2.transferencia(valor);
                }
            } else System.out.println("Opção inválida.");


    }
}
