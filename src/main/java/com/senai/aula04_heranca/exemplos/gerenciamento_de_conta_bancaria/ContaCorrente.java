package com.senai.aula04_heranca.exemplos.gerenciamento_de_conta_bancaria;

import com.senai.aula03_encapsulamento.exercicios.conta_bancaria_com_operacoes_simples.ContaBancaria;

public class ContaCorrente extends ContaBancaria {
    private double limite;

    public ContaCorrente(String titular, double saldo) {
        super(titular, saldo);
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= saldo + limite) {
            saldo -= valor;
            System.out.println("O saldo atual do titular " + this.titular + " é de: " + this.saldo);
        } else throw new IllegalArgumentException("Seu saldo não é suficiente para este saque. Operação cancelada.");
        return false;
    }
}
