package com.senai.aula03_encapsulamento.exemplos.gerenciamento_de_funcionarios;

import java.util.ArrayList;
import java.util.Arrays;

public class Funcionario {
    private String nome;
    private double salario;
    private String cargo;
    private String[] listaCargos = {"gerente", "programador", "analista"};

    public Funcionario(String nome, double salario, int idCargo) {
        if (nome.isBlank()) {
            System.out.println("O nome está vazio. Será atribuido como anonimo.");
        } else this.nome = nome;

        if (salario < 1320.0) {
            System.out.println("o salário deve ser maior ou igual a R$1320,00.");
        } else this.salario = salario;

        if (idCargo >= 1 && idCargo <= listaCargos.length) {
            this.cargo = listaCargos[idCargo - 1];
        } else {
            System.out.println("Cargo inválido.");
            System.out.println("O campo cargo será atribuido como programador");
        }
    }

    public void aumentarSalario(int percentagemAumento) {
        if (percentagemAumento > 0) {
            this.salario += (salario * percentagemAumento) / 100;
            System.out.println("O aumento do salário do funcionario " + nome +
                    " realizado com sucesso. Valor: " + salario);
        }
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setNome(String nome) {
        if (nome.isBlank()) {
            System.out.println("O nome está vazio.");
        } else this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setCargo(int idCargo) {
        if (idCargo >= 1 && idCargo <= listaCargos.length) {
            this.cargo = listaCargos[idCargo - 1];
        } else {
            System.out.println("Cargo inválido.");

        }
    }

    @Override
    public String toString() {
        return this.nome + " | R$" + this.salario + " | " + this.cargo + "\n";
    }
}
