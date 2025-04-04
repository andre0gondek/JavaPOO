package com.senai.aula06_abstracao.exemplos.exemplos_classe_abstrata.gerenciamento_de_funcionarios;

public abstract class Funcionarios {
    protected String nome;
    protected double salario;

    public Funcionarios(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void aumentarSalario(int porcentagem){
        salario += salario*porcentagem/100;
    }

    public abstract double calcularBonus();

    public void exibirDados(){
        System.out.printf("\n %s recebe R$%,.2f \n", nome, salario);
    }
}
