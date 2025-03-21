package com.senai.aula05_polimorfismo.exemplos.animal;

public class Pato extends Animal{
    @Override
    void fazerSom() {
        System.out.println("quack pato");
    }
    void voar(){
        System.out.println("voar voar");
    }
}
