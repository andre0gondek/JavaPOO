package com.senai.aula01_introducao_poo.exercicios.Exercicio1;

import java.util.Objects;

public class Produtos {
    String nome;
    double preco;
    int qtd;

    public Produtos(String nome, double preco, int qtd) {
        this.nome = nome;
        this.preco = preco;
        this.qtd = qtd;
    }

    public void exibirDetalhes() {
        System.out.printf("Nome do Produto: " + nome + "\nValor do produto: R$" + preco +
                "\nQuantidade em estoque: " + qtd);
    }

    public void atualizaEstoque(String escolha, int qtdpdt) {
        if (Objects.equals(escolha, "diminuir")){
            qtd += qtdpdt;
        } else if (Objects.equals(escolha, "aumentar")) {
            qtd -= qtdpdt;
        }
    }

    public void calcularValorEstoque() {
        float estoqueTotal;
        estoqueTotal = (float) (preco * qtd);

        System.out.printf("\nO valor total do nosso estoque do produto %s é de: R$%,.2f", nome, estoqueTotal);
        System.out.println("\n----------------------------------------------");
    }
}
