package com.senai.aula03_encapsulamento.exemplos.conta_bancaria_com_operacoes_simples;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContaBancaria contaBancaria1 = new ContaBancaria("João", 0.0);
        ContaBancaria contaBancaria2 = new ContaBancaria("Rafael", 0.0);

        System.out.println(contaBancaria1);
        System.out.println(contaBancaria2);

        System.out.println("----Teste depósito----");

        contaBancaria1.depositar(10000);
        contaBancaria2.depositar(30);

        System.out.println("----Teste saque----");

        contaBancaria1.sacar(6000);
        contaBancaria2.sacar(13);

        System.out.println("----Teste transferencia----");
        contaBancaria1.transferencia(30, contaBancaria2);
    }
}