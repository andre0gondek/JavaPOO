package com.senai.aula04_heranca.exercicios.sistema_de_atendimento_medico;

public class PacienteParticular extends Paciente{
    private int custoConsulta;

    public PacienteParticular(String nome, int idade, int custoConsulta) {
        super(nome, idade);
        this.custoConsulta = custoConsulta;
    }

    public int getCustoConsulta() {
        return custoConsulta;
    }
}
