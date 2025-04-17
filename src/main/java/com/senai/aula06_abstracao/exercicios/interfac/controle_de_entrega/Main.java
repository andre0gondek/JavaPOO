package com.senai.aula06_abstracao.exercicios.interfac.controle_de_entrega;

public class Main {
    public static void main(String[] args) {
        validar(new Bicicleta(10, 5));
        System.out.println("");
        validar(new Moto(50, 7));
    }
    public static void validar(TotalExpress totalExpress){
        totalExpress.exibirDados();
        totalExpress.calculoTempoDeEntrega();
    }
}
