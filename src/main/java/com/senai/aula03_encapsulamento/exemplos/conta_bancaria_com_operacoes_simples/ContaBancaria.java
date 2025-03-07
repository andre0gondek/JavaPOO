package com.senai.aula03_encapsulamento.exemplos.conta_bancaria_com_operacoes_simples;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        if (saldo >= 0) {
        this.saldo = saldo;
        } else System.out.println("O saldo deve ser maior ou igual a zero. Seu saldo iniciará com R$0,00.");
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void depositar(double valor) {
        if (valor >= 0){
            saldo += valor;
            System.out.println("Depósito realizado com sucesso na conta do titular " + titular + ". Seu saldo atual é de: " + saldo);
        } else System.out.println("O valor deve ser positivo.");

    }
    public void sacar(double valor){
         if (valor <= saldo && valor > 0) {
             saldo -= valor;
             System.out.println("Saque realizado com sucesso na conta do titular " + titular + ". Seu saldo atual é de: " + saldo);
         }else System.out.println("Seu saldo não é suficiente para este saque. Operação cancelada.");
    }

    public void transferencia(double valor, ContaBancaria contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }


    @Override
    public String toString() {
        return "--Conta Bancaria--\n" +
                "Titular=" + titular +
                "\nSaldo=" + saldo +
                '\n';
    }
}