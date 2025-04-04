package com.senai.aula06_abstracao.exemplos.exemplos_classe_abstrata.conta_bancaria;

public class ContaCorrente extends ContaBancaria {
    public ContaCorrente(double saldo, String titular) {
        super(saldo, titular);
    }

    @Override
    void aplicarTaxaMensal() {
        saldo -= 20;
    }
}
