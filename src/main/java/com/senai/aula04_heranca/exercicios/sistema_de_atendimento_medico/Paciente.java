package com.senai.aula04_heranca.exercicios.sistema_de_atendimento_medico;

public class Paciente {
    private String nome;
    private int idade;

    public Paciente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void setNome(String nome) {
        if (nome.isBlank()) {
            throw new IllegalArgumentException("Erro 450: O nome não pode estar vazio.");
        }
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            throw new IllegalArgumentException("Erro 455: A idade digitada é negativa.");
        } else if (idade < 18) {
            throw new IllegalArgumentException("Usuários menores de idade não podem realizar consultas!");
        } else this.idade = idade;
    }

    public String getNome() {
        return nome;
    }
}
