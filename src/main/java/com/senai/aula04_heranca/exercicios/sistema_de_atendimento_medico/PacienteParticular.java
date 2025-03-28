package com.senai.aula04_heranca.exercicios.sistema_de_atendimento_medico;

public class PacienteParticular extends Paciente{
    private double custoConsulta = 200;

    public PacienteParticular(String nome, int idade, double custoConsulta) {
        super(nome, idade);
        this.custoConsulta = custoConsulta;
    }

    public double getCustoConsulta() {
        return custoConsulta;
    }
    public void exibirConsulta(){
        System.out.printf("Olá, %s! Sua consulta ficou R$%,.2f", getNome(), getCustoConsulta());
    }
}
