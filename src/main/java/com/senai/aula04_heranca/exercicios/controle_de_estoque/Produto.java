package com.senai.aula04_heranca.exercicios.controle_de_estoque;

public class Produto {
    private String nome;
    private double valor;
    private int qtd;

    public Produto(String nome, double valor, int qtd) {
        if (valor < 0){
            System.out.println("O valor do produto não pode ser negativo. O valor do produto será de R$0,00.");
        } else this.valor = valor;
        this.nome = nome;
        if (qtd < 0){
            System.out.println("A quantidade do produto não pode ser negativa. A quantidade do produto será atribuida como Zero.");
        } else this.qtd = qtd;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    @Override
    public String toString() {
        return "Nome do produto: "+ nome + "\nValor: R$"+ valor +"\nQuantidade em estoque: " + qtd;
    }
}
