package com.senai.aula05_polimorfismo.exercicios.sistema_de_beneficios_de_funcionários;

public class Beneficios {
    private int salario;
    private double desconto;



    public void descontar(double desconto, int salario){
        System.out.println("Salário Bruto: R$" + salario);
        desconto = desconto/100;

        int descontado = (int) (salario * desconto);
        System.out.println("Desconto de R$" + descontado);

        salario -= (int) (salario * desconto);
        System.out.println("Salário líquido: R$" + salario);
    }
}
