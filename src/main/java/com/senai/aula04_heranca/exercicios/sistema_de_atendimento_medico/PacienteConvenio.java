package com.senai.aula04_heranca.exercicios.sistema_de_atendimento_medico;

public class PacienteConvenio extends Paciente{
    private int desconto;

    public PacienteConvenio(String nome, int idade, int desconto) {
        super(nome, idade);
        this.desconto = desconto;
    }
    public void aplicarDesconto(int valorConsulta){
        int divisao = desconto/100;
        valorConsulta = valorConsulta * divisao;
    }

}
