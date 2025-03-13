package com.senai.aula04_heranca.exemplos.sistema_de_cadastro_de_funcionarios;

public class Gerente extends Funcionario {
    private double bonus;

    public Gerente(String nome, double salario, double bonus) {
        super(nome, salario);
        if (bonus <= 0){
            throw new IllegalArgumentException("O gerente deve ter um bonus maior que zero.");
        }
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public void exibirDados() {
        System.out.printf("Nome: %s Salário: %,.2f\n", getNome(), (salario + bonus));
    }
}
