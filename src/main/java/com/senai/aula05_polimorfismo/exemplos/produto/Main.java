package com.senai.aula05_polimorfismo.exemplos.produto;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("xuxu");
        Produto produto2 = new Produto(10.9, "batata");
        Produto produto3 = new Produto("arroz", 300.0, 70);
        Produto produto4 = new Produto();

        System.out.println(produto1);
        System.out.println(produto2);
        System.out.println(produto3);
        System.out.println(produto4);
    }
}
