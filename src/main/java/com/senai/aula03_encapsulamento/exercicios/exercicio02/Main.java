package com.senai.aula03_encapsulamento.exercicios.exercicio02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Roger", 0.0);
        Scanner scanner = new Scanner(System.in);

        int escolha;
            System.out.println("Deseja depositar ou sacar dinheiro?\n1-Depositar\n2-Sacar");
            escolha = scanner.nextInt();
            if (escolha == 1) {
                System.out.println("Digite o valor a ser depositado: ");
                double valor = scanner.nextDouble();
                conta.depositar(valor);
            } else if (escolha == 2) {
                System.out.println("Digite o valor a ser sacado: ");
                double valor = scanner.nextDouble();
                conta.sacar(valor);
            } else if (escolha == 3) {
                System.out.println("Encerrando o programa...");
            } else System.out.println("Opção inválida.");


    }
}
