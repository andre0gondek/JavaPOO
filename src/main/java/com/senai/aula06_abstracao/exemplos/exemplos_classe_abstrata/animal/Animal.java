package com.senai.aula06_abstracao.exemplos.exemplos_classe_abstrata.animal;

public abstract class Animal {
   protected String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

   public void dormir(){
        System.out.println(nome + ": zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz...");
    }

    abstract void fazerSom();
}
