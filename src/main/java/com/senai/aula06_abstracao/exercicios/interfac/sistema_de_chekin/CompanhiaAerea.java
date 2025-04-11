package com.senai.aula06_abstracao.exercicios.interfac.sistema_de_chekin;

public class CompanhiaAerea implements FlySecure{

    @Override
    public void validarDocs() {
        System.out.println("Seus documentos foram validados com sucesso.");
    }

    @Override
    public void emitirCartoes() {
        System.out.println("Cartões de embarque emitidos com sucesso.");
    }

    @Override
    public void boasVindas() {
        System.out.println("--Bem-vindo à nossa companhia GOL.--");
    }
}
