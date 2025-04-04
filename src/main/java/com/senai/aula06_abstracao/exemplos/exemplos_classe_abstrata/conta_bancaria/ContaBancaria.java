package com.senai.aula06_abstracao.exemplos.exemplos_classe_abstrata.conta_bancaria;

abstract class ContaBancaria {
    protected String titular;
    protected double saldo;

    public ContaBancaria(double saldo, String titular) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else throw new IllegalArgumentException("O saldo deve ser maior ou igual a zero. Seu saldo iniciará com R$0,00.");
        this.titular = titular;
    }



    abstract void aplicarTaxaMensal();


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
