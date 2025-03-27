package com.senai.aula04_heranca.exercicios.sistema_de_atendimento_medico;

public class Paciente {
    private String nome;
    private int idade;

    public Paciente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


}
