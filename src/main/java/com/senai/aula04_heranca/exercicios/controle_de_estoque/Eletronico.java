package com.senai.aula04_heranca.exercicios.controle_de_estoque;

public class Eletronico extends Produto{
    private int voltagem;

    public Eletronico(String nome, double valor, int qtd, int voltagem) {
        super(nome, valor, qtd);
        this.voltagem = voltagem;
    }

    @Override
    public String toString() {
        return super.toString() + "\nVoltagem: " + voltagem + "V";
    }
}
