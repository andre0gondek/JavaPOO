package com.senai.aula04_heranca.exemplos.veiculo;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Aston Martin", 1998, 4);
        Moto moto = new Moto("Yamaha", 2007, true);
        carro1.exibirDetalhes();
        moto.exibirDetalhes();
    }
}
