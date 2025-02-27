package com.senai.aula03_encapsulamento.exercicios.exercicio01;

public class Produtos {
    private String nomeProduto;
    private double precoProduto;

    //getters
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        if (precoProduto >= 0){
            this.precoProduto = precoProduto;
        }else {
            throw new IllegalArgumentException("O valor não pode ser negativo.");
        }
    }

    //setters
    public String getNomeProduto() {
        return nomeProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

}

