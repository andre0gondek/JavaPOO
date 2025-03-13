package com.senai.aula04_heranca.exemplos.gerenciamento_de_conta_bancaria;

import com.senai.aula03_encapsulamento.exercicios.conta_bancaria_com_operacoes_simples.ContaBancaria;

public class ContaPoupanca extends ContaBancaria {
    private int rendimento;

    public ContaPoupanca(String titular, double saldo, int rendimento) {
        super(titular, saldo);
        this.rendimento = rendimento;
    }
    public void rendimento(){
        saldo += (saldo * rendimento)/100;
    }
}
