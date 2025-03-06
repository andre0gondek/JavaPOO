package com.senai.aula03_encapsulamento.exemplos.cadastro_de_produto_simples;

public class Main {
    public static void main(String[] args) {
        Produtos produto1 = new Produtos(9.3,"Arroz");
        Produtos produto2 = new Produtos(8.0,"Ração");

        System.out.println(produto1);
        System.out.println(produto2);

        produto1.setPrecoProduto(10.0);
        produto2.setPrecoProduto(90.0);

        System.out.println("----Produtos Atualizados----");
        System.out.println(produto1);
        System.out.println(produto2);
    }
}
