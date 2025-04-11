package com.senai.aula06_abstracao.exercicios.interfac.sistema_de_chekin;

public interface FlySecure {
    int PESO_MAX = 30;

    static void exibirAviso(){
        System.out.println("Check-in seguro realizado pela FlySecure");
    }
    void validarDocs();
    void emitirCartoes();
    void boasVindas();
}
