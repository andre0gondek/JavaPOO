package com.senai.aula04_heranca.exercicios.sistema_de_funcionarios;

public class Professor extends Funcionario{
    private String disciplina;

    public Professor(String nome, double salario, String disciplina) {
        super(nome, salario);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public String toString() {
        return "\nNome: " + getNome() +
                "\nSalario: " + getSalario() +
                "\nDisciplina: " + disciplina +
                "\n---------------------------";
    }
}
