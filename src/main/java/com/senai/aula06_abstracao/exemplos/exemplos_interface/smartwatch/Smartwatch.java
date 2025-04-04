package com.senai.aula06_abstracao.exemplos.exemplos_interface.smartwatch;

public class Smartwatch implements SensorCardiaco, SensorPassos, SensorSono{
    @Override
    public void medirFreqCardiaca() {
        System.out.println("Medição cardíaca: 80bpm");
    }

    @Override
    public void contarPassos() {
        System.out.println("Passos hoje: 3000");
    }

    @Override
    public void medirQualidadeSono() {
        System.out.println("Sono definido para 7h 30");
    }

    public void infoDispositivos(){
        System.out.println("Dispositivos conectados");
    }
}
