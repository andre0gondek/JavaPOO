package com.senai.aula06_abstracao.exemplos.exemplos_interface.veiculo;

public class Carro implements Veiculo {

    @Override
    public void acelerar() {
        System.out.println("Vruum! 10Km/h.... 20Km/h.... 280Km/h...");
    }
}