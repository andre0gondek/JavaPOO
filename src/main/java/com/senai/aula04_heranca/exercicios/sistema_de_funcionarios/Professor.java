package com.senai.aula04_heranca.exercicios.sistema_de_funcionarios;

public class Professor extends Funcionario{
    private String disciplina;

    public Professor(String nome, double salario, String disciplina) {
        super(nome, salario);
        this.disciplina = disciplina;
    }
}
