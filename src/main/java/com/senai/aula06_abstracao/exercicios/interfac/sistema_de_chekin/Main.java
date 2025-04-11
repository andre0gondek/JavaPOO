package com.senai.aula06_abstracao.exercicios.interfac.sistema_de_chekin;

public class Main {
    public static void main(String[] args) {

        FlySecure.exibirAviso();
        System.out.println("Não se esqueça que o peso máximo de bagagens suportado é de: " + FlySecure.PESO_MAX + "Kg!");


        CompanhiaAerea gol = new CompanhiaAerea();
        gol.boasVindas();
        gol.validarDocs();
        gol.emitirCartoes();

        System.out.println("");

        CompanhiaAerea2 voarEPerigoso = new CompanhiaAerea2();
        voarEPerigoso.boasVindas();
        voarEPerigoso.validarDocs();
        voarEPerigoso.emitirCartoes();

    }
}
