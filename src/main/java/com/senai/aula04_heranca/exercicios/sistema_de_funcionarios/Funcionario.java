package com.senai.aula04_heranca.exercicios.sistema_de_funcionarios;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        if (nome.isBlank()) {
            throw new IllegalArgumentException("O nome não pode estar vazio.");
        } else this.nome = nome;

        if (salario < 1320.0) {
            throw new IllegalArgumentException("o salário deve ser maior ou igual a R$6000,00");
        } else this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }
}
