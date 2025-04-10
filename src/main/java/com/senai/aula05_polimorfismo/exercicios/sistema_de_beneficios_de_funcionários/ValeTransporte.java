package com.senai.aula05_polimorfismo.exercicios.sistema_de_beneficios_de_funcionários;

public class ValeTransporte extends Beneficios{
    @Override
    public void descontar(double desconto, int salario) {
        System.out.println("---Desconto VT---");
        super.descontar(desconto, salario);
    }
}
