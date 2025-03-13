package com.senai.aula04_heranca.exemplos.sistema_de_cadastro_de_funcionarios;

public class Funcionario {
    private String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        if (salario < 1420){
            throw new IllegalArgumentException("O salário do funcionário " + this.nome + " deve ser maior que 1320.");
        }
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void exibirDados(){
        System.out.printf("Nome: %s , Salário: R$%,.2f\n", nome, salario);
    }
}
