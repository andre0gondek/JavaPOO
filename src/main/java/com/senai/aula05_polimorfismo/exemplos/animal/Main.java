package com.senai.aula05_polimorfismo.exemplos.animal;

import com.senai.aula04_heranca.exercicios.sistema_de_atendimento_medico.Paciente;

public class Main {
    public static void main(String[] args) {
       // testarSomAnimal(new Cachorro());
        testarSomAnimal(new Pato());
    }

    public static void testarSomAnimal(Animal animal){
        animal.fazerSom();
        Pato pato = (Pato) animal;
        pato.voar();
    }

}
