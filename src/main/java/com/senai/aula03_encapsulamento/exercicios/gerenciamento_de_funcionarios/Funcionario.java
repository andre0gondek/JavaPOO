package com.senai.aula03_encapsulamento.exercicios.gerenciamento_de_funcionarios;

import java.util.ArrayList;

public class Funcionario {
    private String nome;
    private double salario;
    private String cargo;

    public Funcionario(String nome, double salario, String cargo, ArrayList<String> listaCargos) {
        listaCargos.add("gerente");
        listaCargos.add("programador");
        listaCargos.add("analista");
        if (nome == null) {
            throw new IllegalArgumentException("O nome não pode estar vazio.");
        } else this.nome = nome;

        if (salario < 1320.0) {
            throw new IllegalArgumentException("o salário deve ser maior ou igual a R$1320,00");
        } else this.salario = salario;


        if (!listaCargos.contains(cargo.toLowerCase())) {
            throw new IllegalArgumentException("O cargo do funcionário " + this.nome + " será definido como '" + this.cargo + "', que é inválido.");
        } else this.cargo = cargo;

    }


    public void aumentarSalario(int valor) {
        if (valor > 0) {
            this.salario += (salario * valor) / 100;
        }
    }

    //setters
    public void setNome(String nome) {
        if (nome == null) {
            throw new IllegalArgumentException("O nome não pode estar vazio.");
        } else this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setCargo(String listaCargos) {

        this.cargo = cargo;
    }
    //getters

    public double getSalario() {
        System.out.printf("O salário do funcionario " + nome + " é agora de: R$" + salario + "\n");
        return salario;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        System.out.println("O cargo do funcionario" + nome + "atual é: " + cargo);
        return cargo;
    }


    @Override
    public String toString() {
        return this.nome + " | R$" + this.salario + " | " + this.cargo + "\n";
    }
}
