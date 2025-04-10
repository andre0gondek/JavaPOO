package com.senai.aula05_polimorfismo.exercicios.sistema_de_monitoramento_de_sensores;

public class SensorTemperatura extends Sensor{
    private int temp;

    public SensorTemperatura(int temp) {
        this.temp = temp;
    }

    @Override
    public void valor() {
        System.out.println("---Temperatura---");
        super.valor();
        System.out.println("Temperatura atual: " + temp + "°C");
    }
}
