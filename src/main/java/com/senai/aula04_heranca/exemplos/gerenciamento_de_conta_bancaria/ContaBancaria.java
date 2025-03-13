package com.senai.aula04_heranca.exemplos.gerenciamento_de_conta_bancaria;

public class ContaBancaria {
    private String titular;
    protected double saldo;

    public ContaBancaria(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    //métodos
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
    public void exibirSaldo(){
        System.out.printf("Titular: %s , Saldo: R$%,.2f\n", titular, saldo);
    }
}
