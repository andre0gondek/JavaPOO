package com.senai.aula05_polimorfismo.exemplos.calculadora;

public class Calculadora {
    int somar(int a, int b){
        System.out.println("int int");
        return a+b;
    }
    int somar(int a, int b, int c){
        System.out.println("Int int int");
        return a+b+c;
    }
    double somar(int a, double b){
        System.out.println("int double");
        return a+b;
    }
    double somar(double a, double b){
        System.out.println("double doube");
        return a+b;
    }
    double somar(double a, int b){
        System.out.println("double int");
        return a+b;
    }
    double somar(double a, double b, int c){
        System.out.println("double double int");
        return a+b+c;
    }
}
