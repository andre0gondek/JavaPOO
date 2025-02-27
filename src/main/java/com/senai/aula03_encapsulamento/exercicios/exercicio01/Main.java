package com.senai.aula03_encapsulamento.exercicios.exercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Produtos produto = new Produtos();
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite o nome do produto, e o preço.");
        String nome = scanner.nextLine();
        double preco = scanner.nextDouble();
        produto.setNomeProduto(nome);
        produto.setPrecoProduto(preco);

        System.out.println("----Produtos----");
        System.out.println(produto.getNomeProduto());
        System.out.println(produto.getPrecoProduto());
    }
}