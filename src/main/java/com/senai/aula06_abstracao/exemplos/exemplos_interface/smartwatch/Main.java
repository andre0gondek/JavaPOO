package com.senai.aula06_abstracao.exemplos.exemplos_interface.smartwatch;

public class Main {
    public static void main(String[] args) {
        Smartwatch smartwatch = new Smartwatch();
        smartwatch.infoDispositivos();
        smartwatch.contarPassos();
        smartwatch.medirFreqCardiaca();
        smartwatch.medirQualidadeSono();
    }
}
