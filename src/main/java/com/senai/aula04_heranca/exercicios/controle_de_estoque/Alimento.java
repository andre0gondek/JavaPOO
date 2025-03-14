package com.senai.aula04_heranca.exercicios.controle_de_estoque;

public class Alimento extends Produto {
    private int validade;

    public Alimento(String nome, double valor, int qtd, int validade) {
        super(nome, valor, qtd);
        if (validade <= 2025){
            throw new IllegalArgumentException("Erro ao adicionar o produto " + nome + ". A validade do alimento deve ser superior ao ano vigente (2025).");
        } else this.validade = validade;
    }

    @Override
    public String toString() {
        return super.toString() + "\nValidade: " + validade;
    }
}
