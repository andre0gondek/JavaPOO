package com.senai.aula06_abstracao.exemplos.exemplos_classe_abstrata.animal;

public class Pato extends Animal{

    public Pato(String nome) {
        super(nome);
    }

    @Override
    void fazerSom() {
        System.out.println("quack quack quack quack quack.");
    }

    void botarOvo(){
        System.out.println("PLUC..........." + nome + "virou mamae!");
    }
}
