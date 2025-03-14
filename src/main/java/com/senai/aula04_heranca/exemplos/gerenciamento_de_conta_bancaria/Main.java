package com.senai.aula04_heranca.exemplos.gerenciamento_de_conta_bancaria;

public class Main {
    public static void main(String[] args) {
        ContaPoupanca contaPoupanca = new ContaPoupanca(10000, "Rodrigo", 40);
        ContaCorrente contaCorrente = new ContaCorrente(10000, "Pedro", 1000);

        contaPoupanca.exibirSaldo();
        contaCorrente.exibirSaldo();

        System.out.println("----TESTE----");
        contaCorrente.sacar(15000);
        contaCorrente.sacar(9000);
        contaCorrente.sacar(1000);

        System.out.println("----Teste 2----");
        contaPoupanca.rendimento();

        contaCorrente.exibirSaldo();
        contaPoupanca.exibirSaldo();
    }
}