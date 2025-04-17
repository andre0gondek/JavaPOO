package com.senai.aula06_abstracao.exercicios.interfac.controle_de_entrega;

abstract class TotalExpress {
    protected int velocidade;
    protected int distancia;
    private int cargaMax = 20;

    public TotalExpress(int velocidade, int distancia) {
        this.velocidade = velocidade;
        this.distancia = distancia;
    }

    public void exibirDados(){
        System.out.println("Distância: " + distancia +"Km");
        System.out.println("Velocidade atual: " + velocidade + "Km/h");
        System.out.println("Carga máxima do veículo: " + cargaMax + "Kg");
    }

    abstract void calculoTempoDeEntrega();
}
