package com.senai.aula05_polimorfismo.exercicios.sistema_de_monitoramento_de_sensores;

public class Main {
    public static void main(String[] args) {
        testarValores(new SensorTemperatura(10));
        testarValores(new SensorUmidade(60));
    }
    public static void testarValores(Sensor sensor){
        sensor.valor();
    }
}
