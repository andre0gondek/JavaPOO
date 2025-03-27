package com.senai.aula05_polimorfismo.exemplos.sistema_de_pagamentos;

public class Pagamentos {
    private String nome;

    public Pagamentos(String nome) {
        this.nome = nome;
    }

    public double calcularPagamento(){
        return 0.0;
    }

    public String getNome() {
        return nome;
    }
}
