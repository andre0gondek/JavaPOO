package com.senai.aula04_heranca.exercicios.sistema_de_atendimento_medico;

public class PacienteConvenio extends Paciente{
    private int desconto;

    public PacienteConvenio(String nome, int idade, int desconto) {
        super(nome, idade);
        this.desconto = desconto;
    }
    public void aplicarDesconto(double valorConsulta){
        double divisao = (double) desconto /100;
        valorConsulta -= valorConsulta * divisao;
        System.out.println("Que demais! Você recebeu um desconto de " + desconto + "%!");
        System.out.printf("O total de sua consulta será de R$%,.2f!", valorConsulta);
    }

}
