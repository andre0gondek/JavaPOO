package com.senai.aula03_encapsulamento.exercicios.exercicio02;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        if (saldo >= 0) {
        this.saldo = saldo;
        } else throw new IllegalArgumentException("O saldo deve ser maior ou igual a zero.");
    }

    public void depositar(double valor) {
        if (valor >= 0){
            this.saldo = this.saldo + valor;
            System.out.println("Seu saldo atual é de: " + this.saldo);
        } else throw new IllegalArgumentException("O valor deve ser positivo. Operação cancelada.");

    }
    public void sacar(double valor){
         if (valor <= saldo) {
             this.saldo = this.saldo - valor;
        System.out.println("Seu saldo atual é de: " + this.saldo);
         }else throw new IllegalArgumentException("Seu saldo não é suficiente para este saque. Operação cancelada.");
    }

    public double getSaldo(){
        return saldo;
    }

    @Override
    public String toString() {
        return "--ContaBancaria--\n" +
                "Titular='" + titular +
                "\nSaldo=" + saldo +
                '}';
    }
}
