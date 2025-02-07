package com.senai.aula01_introducao_poo.exercicios.Exercicio1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Produtos produto1 = new Produtos(
                "Picanha",
                599.99,
                30
        );
        Produtos produto2 = new Produtos(
                "Café",
                99.99,
                12
        );


        System.out.println("Deseja aumentar ou diminuir o produto?");
        String escolha = scanner.nextLine();
        int qtdpdt = scanner.nextInt();

        produto1.atualizaEstoque(escolha,qtdpdt);
        produto1.exibirDetalhes();
        produto1.calcularValorEstoque();

        produto2.atualizaEstoque(escolha,qtdpdt);
        produto2.exibirDetalhes();
        produto2.calcularValorEstoque();
    }
}
