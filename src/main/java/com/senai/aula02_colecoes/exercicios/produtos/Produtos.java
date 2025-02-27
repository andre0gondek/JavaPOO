package com.senai.aula02_colecoes.exercicios.produtos;

public class Produtos {
    String nomeProduto;
    int qtdEstoque;

    public Produtos(String nomeProduto, int qtdEstoque) {
        this.nomeProduto = nomeProduto;
        this.qtdEstoque = qtdEstoque;
    }

    public Produtos(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    @Override
    public String toString() {
        return "Produto: " + nomeProduto + " | " +
                "Estoque: " + qtdEstoque;
    }
}
