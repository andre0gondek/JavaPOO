package com.senai.aula06_abstracao.exemplos.exemplos_classe_abstrata.animal;

public class Main {
    public static void main(String[] args) {
        testeAnimal(new Cachorro("Gilberto"));
        testeAnimal(new Pato("Alexandre de Moraes"));
    }
    private static void testeAnimal(Animal animal){
        animal.dormir();
        animal.fazerSom();
        if (animal instanceof Pato pato) {
            pato.botarOvo();

        }


    }
}
