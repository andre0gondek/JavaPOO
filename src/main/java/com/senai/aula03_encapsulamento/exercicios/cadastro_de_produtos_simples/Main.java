package com.senai.aula03_encapsulamento.exercicios.cadastro_de_produtos_simples;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Produtos produto1 = new Produtos(7.9,"Pessego");
        Produtos produto2 = new Produtos(70.0,"Café Pilão");
        Scanner scanner = new Scanner(System.in);

        System.out.println(produto1);
        System.out.println(produto2);

        System.out.println("Digite o novo preço do produto: " + produto1.getNomeProduto());
        double preco = scanner.nextDouble();
        produto1.setPrecoProduto(preco);

        System.out.println("Digite o novo preço do produto: " + produto2.getNomeProduto());
        double preco2 = scanner.nextDouble();
        produto2.setPrecoProduto(preco2);

        System.out.println("----Produtos----");
        System.out.println(produto1);
        System.out.println(produto2);
    }
}