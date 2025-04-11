package com.senai.aula06_abstracao.exercicios.interfac.sistema_de_chekin;

public class CompanhiaAerea2 implements FlySecure{

    @Override
    public void validarDocs() {
        System.out.println("Seus documentos foram validados com suceso!");
    }

    @Override
    public void emitirCartoes() {
        System.out.println("Gerando cartões de embarque...");
    }

    @Override
    public void boasVindas() {
        System.out.println("--Boas vindas a companhia Voar É Perigoso!--");
    }
}
