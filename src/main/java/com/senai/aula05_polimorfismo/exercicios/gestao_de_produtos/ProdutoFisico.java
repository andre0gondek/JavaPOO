package com.senai.aula05_polimorfismo.exercicios.gestao_de_produtos;

public class ProdutoFisico extends Produto {
    @Override
    public void aplicarImposto(double imposto, int preco) {
        System.out.println("---Produto Físico---");
        super.aplicarImposto(imposto, preco);
    }
}
