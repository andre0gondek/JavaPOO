package com.senai.aula06_abstracao.exemplos.exemplos_classe_abstrata.veiculo;

public class Carro extends Veiculo{
    public Carro(int velocidade) {
        super(velocidade);
    }

    @Override
    void ligar() {
        System.out.println("vruuummm");
    }

    @Override
    public void acelerar(int incremento) {
        super.acelerar(incremento);
    }
}
