package com.senai.aula05_polimorfismo.exercicios.sistema_de_monitoramento_de_sensores;

public class SensorUmidade extends Sensor{
    private int umd;

    public SensorUmidade(int umd) {
        this.umd = umd;
    }

    @Override
    public void valor() {
        System.out.println("---Umidade---");
        super.valor();
        System.out.println("A umidade está em " + umd + "%");
    }
}
