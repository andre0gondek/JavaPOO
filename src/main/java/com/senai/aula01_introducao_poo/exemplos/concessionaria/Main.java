package com.senai.aula01_introducao_poo.exemplos.concessionaria;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro(
                1.0f,
                "EAS4J45",
                "Branco",
                "Toyota",
                "Hilux",
                0,
                2024,
                90000.00
        );

        Carro carro2 = new Carro(
                6.5f,
                "GXM3L39",
                "Branco",
                "Lamborghini",
                "Veneno",
                50000,
                2013,
                60700000.00
        );

        System.out.println(carro1);

        carro1.testeDrive();
        carro1.comprar(" Rodrigo");
        carro1.valorTabelaFip();

        System.out.println(carro2);
        carro2.testeDrive();
        carro2.comprar(" Gabriel");
        carro2.valorTabelaFip();
    }
}
