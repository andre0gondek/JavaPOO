package com.senai.aula03_encapsulamento.exercicios.gerenciamento_de_funcionarios;

public class Funcionario {
    private String nome;
    private double salario;
    private String cargo;

    public Funcionario(String nome) {
        this.nome = nome;
    }


    //setters
    public void setNome(String nome) {
        if (nome == null){
            throw new IllegalArgumentException("O nome não pode estar vazio.");
        }else this.nome = nome;
    }

    public void setSalario(double salario) {
        if (salario < 1320.0){
            throw new IllegalArgumentException("o salário deve ser maior ou igual a R$1320,00");
        }
        this.salario = salario;
    }

    public void setCargo(String listaCargos) {

        this.cargo = cargo;
    }
    //getters

    public double getSalario() {
        System.out.printf("O salário do funcionario "+ nome + " é agora de: R$" + salario);
        return salario;
    }

    public String getNome() {
        return nome;
    }
    public String getCargo(){
        System.out.println("O cargo do funcionario" + nome + "atual é: " +cargo);
        return cargo;
    }
}
