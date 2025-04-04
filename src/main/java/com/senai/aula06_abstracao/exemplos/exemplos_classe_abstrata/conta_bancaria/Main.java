package com.senai.aula06_abstracao.exemplos.exemplos_classe_abstrata.conta_bancaria;

public class Main {
    public static void main(String[] args) {
        testarContas(new ContaCorrente(1300, "Rodrigo"));
        testarContas(new ContaPoupanca(2000, "Junio"));
    }
    private static void testarContas(ContaBancaria contaBancaria){
        System.out.printf("---Testando conta do cliente: %s---\n", contaBancaria.titular);
        contaBancaria.exibirSaldo();
        contaBancaria.aplicarTaxaMensal();
        contaBancaria.exibirSaldo();
    }
}
