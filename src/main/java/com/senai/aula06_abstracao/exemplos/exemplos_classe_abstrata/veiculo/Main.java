package com.senai.aula06_abstracao.exemplos.exemplos_classe_abstrata.veiculo;

public class Main {
    public static void main(String[] args) {
        testarVeiculos(new Carro(120));
        testarVeiculos(new Moto(90));
    }
    private static void testarVeiculos(Veiculo veiculo){
        veiculo.ligar();
        veiculo.acelerar(30);
    }
}
