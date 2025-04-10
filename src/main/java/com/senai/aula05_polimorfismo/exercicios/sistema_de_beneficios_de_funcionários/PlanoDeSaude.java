package com.senai.aula05_polimorfismo.exercicios.sistema_de_beneficios_de_funcionários;

public class PlanoDeSaude extends Beneficios{
    @Override
    public void descontar(double desconto, int salario) {
        System.out.println("---Desconto Plano de Saúde---");
        super.descontar(desconto, salario);
    }
}
