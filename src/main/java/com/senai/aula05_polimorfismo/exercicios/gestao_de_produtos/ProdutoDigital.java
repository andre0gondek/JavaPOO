package com.senai.aula05_polimorfismo.exercicios.gestao_de_produtos;

public class ProdutoDigital extends Produto{
    @Override
    public void aplicarImposto(double imposto, int preco) {
        System.out.println("---Produto Digital---");
        super.aplicarImposto(imposto, preco);
    }
}
