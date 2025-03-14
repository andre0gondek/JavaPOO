package com.senai.aula04_heranca.exemplos.gerenciamento_de_conta_bancaria;

public class ContaCorrente extends ContaBancaria {
    private double limite;

    public ContaCorrente(double saldo, String titular, double limite) {
        super(saldo, titular);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= (saldo + limite) && valor > 0) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso do titular " + getTitular() + "! \nSaldo Atual R$" + saldo);
            return true;
        } else {
            System.out.println("Saldo insuficiente!");
            return false;
        }
    }
}

