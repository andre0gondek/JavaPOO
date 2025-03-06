package com.senai.aula03_encapsulamento.exercicios.cadastro_de_produtos_simples;

import java.util.Objects;

public class Produtos {
    private String nomeProduto;
    private double precoProduto;

    public Produtos(double precoProduto, String nomeProduto) {
        if (precoProduto >= 0){
            this.precoProduto = precoProduto;
        }else {
            throw new IllegalArgumentException("O valor não pode ser negativo. O valor atribuido ao produto será R$0,00");
        }
        this.nomeProduto = nomeProduto;
    }

    //setters
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

    //getters
    public String getNomeProduto() {
        return nomeProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    @Override
    public String toString() {
        return "--------------\nProduto: " + nomeProduto + "\nPreço: " + precoProduto + "\n--------------";
    }
}

