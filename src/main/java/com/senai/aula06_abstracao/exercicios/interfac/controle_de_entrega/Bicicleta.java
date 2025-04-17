package com.senai.aula06_abstracao.exercicios.interfac.controle_de_entrega;

public class Bicicleta extends TotalExpress{

    public Bicicleta(int velocidade, int distancia) {
        super(velocidade, distancia);
    }

    @Override
    void calculoTempoDeEntrega() {
        int velocidade = 20;
        int tempo = velocidade * distancia;
        tempo = tempo/60;
        System.out.println("Velocidade atual do entregador: " + velocidade + "km/h");
        System.out.println("O entregador está indo até sua casa de bicicleta. Tempo estimado de entrega: " + tempo + " minutos.");
    }
}
