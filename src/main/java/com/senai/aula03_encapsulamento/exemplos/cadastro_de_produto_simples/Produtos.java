package com.senai.aula03_encapsulamento.exemplos.cadastro_de_produto_simples;

import java.util.Objects;

public class Produtos {
        private String nomeProduto;
        private double precoProduto;

        public Produtos(double precoProduto, String nomeProduto) {
            if (precoProduto >= 0){
                this.precoProduto = precoProduto;
            }else {
                throw new IllegalArgumentException("O valor não pode ser negativo. O valor atribuido ao produto será R$0,00");
            }
            this.nomeProduto = nomeProduto;
        }

        //setters
        public void setNomeProduto(String nomeProduto) {
            this.nomeProduto = nomeProduto;
        }

        public void setPrecoProduto(double precoProduto) {
            if (precoProduto >= 0){
                this.precoProduto = precoProduto;
            }else {
                throw new IllegalArgumentException("O valor não pode ser negativo.");
            }
        }

        //getters
        public String getNomeProduto() {
            return nomeProduto;
        }

        public double getPrecoProduto() {
            return precoProduto;
        }

        //utilizado para comparar atributos de um determinado objeto


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Produtos produtos = (Produtos) o;
        return Double.compare(precoProduto, produtos.precoProduto) == 0 && Objects.equals(nomeProduto, produtos.nomeProduto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeProduto, precoProduto);
    }

    @Override
        public String toString() {
            return "--------------\nProduto: " + nomeProduto + "\nPreço: " + precoProduto + "\n--------------";
        }
    }
