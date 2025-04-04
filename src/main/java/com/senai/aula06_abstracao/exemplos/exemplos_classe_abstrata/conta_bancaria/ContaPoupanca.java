package com.senai.aula06_abstracao.exemplos.exemplos_classe_abstrata.conta_bancaria;

public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca(double saldo, String titular) {
        super(saldo, titular);
    }

    @Override
    void aplicarTaxaMensal() {
        saldo += saldo * 0.05;
    }
}
