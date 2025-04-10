package com.senai.aula05_polimorfismo.exercicios.sistema_de_beneficios_de_funcionários;

public class ValeAlimentacao extends Beneficios{
    @Override
    public void descontar(double desconto, int salario) {
        System.out.println("--Desconto VA--");
        super.descontar(desconto, salario);
    }
}
