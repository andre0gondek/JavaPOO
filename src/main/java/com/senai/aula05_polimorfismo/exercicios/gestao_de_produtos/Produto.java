package com.senai.aula05_polimorfismo.exercicios.gestao_de_produtos;

public class Produto {
    private int preco;
    private double imposto;

    public void aplicarImposto(double imposto, int preco){
        System.out.println("Você foi TAXADO! \nO imposto adicional cobrado será de " + imposto + "% do valor total.");
        imposto = imposto/100;
        preco += (int) (preco * imposto);
        System.out.println("O valor do seu produto agora é de: R$" + preco);
    }
}
