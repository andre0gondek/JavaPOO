package com.senai.aula04_heranca.exemplos.gerenciamento_de_conta_bancaria;

public class ContaPoupanca extends ContaBancaria {
    private int rendimento;

    public ContaPoupanca(double saldo, String titular, int rendimento) {
        super(saldo, titular);
        this.rendimento = rendimento;
    }

    public void rendimento(){
        saldo += (saldo * rendimento)/100;
    }
}
