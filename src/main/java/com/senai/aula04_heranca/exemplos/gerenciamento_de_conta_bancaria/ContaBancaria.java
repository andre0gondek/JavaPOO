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

    public boolean sacar(double valor){
        if (valor <= saldo && valor > 0){
            saldo -= valor;
            System.out.println("Saque realizado com sucesso do titular "+titular+"! \nSaldo Atual R$"+saldo);
            return true;
        }else {
            System.out.println("Saldo insuficiente!");
            return false;
        }
    }
    public void exibirSaldo(){
        System.out.printf("Titular: %s , Saldo: R$%,.2f\n", titular, saldo);
    }
}
