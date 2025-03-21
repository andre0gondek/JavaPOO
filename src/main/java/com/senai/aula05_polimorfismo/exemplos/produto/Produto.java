package com.senai.aula05_polimorfismo.exemplos.produto;

public class Produto {
    private String nome;
    private double preco;
    private int qtd;

    public Produto(String nome) {
        this.nome = nome;
    }

    public Produto(double preco, String nome) {
        this.preco = preco;
        this.nome = nome;
    }

    public Produto(String nome, double preco, int qtd) {
        this.nome = nome;
        this.preco = preco;
        this.qtd = qtd;
    }

    public Produto() {

    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", qtd=" + qtd +
                '}';
    }
}
