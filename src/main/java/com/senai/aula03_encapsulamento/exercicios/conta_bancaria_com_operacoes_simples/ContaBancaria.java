package com.senai.aula03_encapsulamento.exercicios.conta_bancaria_com_operacoes_simples;

import java.util.Objects;

public class ContaBancaria {
    protected String titular;
    protected double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        if (saldo >= 0) {
            this.saldo = saldo;
        } else
            throw new IllegalArgumentException("O saldo deve ser maior ou igual a zero. Seu saldo iniciará com R$0,00.");
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor >= 0) {
            saldo += valor;
            System.out.println("Seu saldo atual é de: " + this.saldo);
        } else throw new IllegalArgumentException("O valor deve ser positivo. Operação cancelada.");

    }

    public boolean sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("O saldo atual do titular " + this.titular + " é de: " + this.saldo);
        } else throw new IllegalArgumentException("Seu saldo não é suficiente para este saque. Operação cancelada.");
        return true;
    }

    public void transferencia(double valor, ContaBancaria contaDestino) {
        if (this.sacar(valor)) {
            contaDestino.depositar(valor);
        }
    }

    @Override
    public String toString() {
        return "--ContaBancaria--\n" +
                "Titular=" + titular +
                "\nSaldo=" + saldo;
    }

}