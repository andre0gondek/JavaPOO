package com.senai.aula06_abstracao.exercicios.interfac.controle_de_entrega;

public class Moto extends TotalExpress{
    public Moto(int velocidade, int distancia) {
        super(velocidade, distancia);
    }

    @Override
    void calculoTempoDeEntrega() {
        int tempo = velocidade * distancia;
        tempo = 5+(tempo/60);
        System.out.println("Velocidade atual do entregador: " + velocidade + "Km/h");
        System.out.println("O entregador está indo até sua casa de moto. Tempo estimado de entrega: " + tempo + " minutos devido ao trânsito.");
    }
}
