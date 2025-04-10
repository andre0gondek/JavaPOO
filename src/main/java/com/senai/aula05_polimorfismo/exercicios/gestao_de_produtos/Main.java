package com.senai.aula05_polimorfismo.exercicios.gestao_de_produtos;

public class Main {
    public static void main(String[] args) {
     ProdutoDigital produtod = new ProdutoDigital();
     produtod.aplicarImposto(60,190);


     ProdutoFisico produtof = new ProdutoFisico();
     produtof.aplicarImposto(30,134);

     ProdutoServico produtoz = new ProdutoServico();
     produtoz.aplicarImposto(100, 345);
    }
}
