package com.senai.aula06_abstracao.exemplos.exemplos_classe_abstrata.veiculo;

public abstract class Veiculo {
    private int velocidade;

    public Veiculo(int velocidade) {
        this.velocidade = velocidade;
    }

    public void acelerar(int incremento){
        velocidade += incremento;
        System.out.println("acelerando para " + velocidade + "Km/h");
    }

    abstract void ligar();
}
