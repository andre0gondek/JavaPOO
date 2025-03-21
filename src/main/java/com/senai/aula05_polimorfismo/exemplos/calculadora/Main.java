package com.senai.aula05_polimorfismo.exemplos.calculadora;

public class Main {
    public static void main(String[] args) {
        Calculadora calcular = new Calculadora();
        calcular.somar(3,6);
        calcular.somar(7, 5, 7);
        calcular.somar(9.0, 3.0);
        calcular.somar(7, 9.0);
        calcular.somar(7.7, 9);
        calcular.somar(9.0,7.4,9);

        System.out.println();
    }
}
