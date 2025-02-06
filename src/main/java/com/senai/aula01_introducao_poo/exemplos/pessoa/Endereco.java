package com.senai.aula01_introducao_poo.exemplos.pessoa;

public class Endereco {
    String nomeDaRua;
    int numeroDaRua;
    String bairro;
    String municipio;
    String estado;

    public Endereco(String nomeDaRua, int numeroDaRua, String bairro, String municipio, String estado) {
        this.nomeDaRua = nomeDaRua;
        this.numeroDaRua = numeroDaRua;
        this.bairro = bairro;
        this.municipio = municipio;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Rua " + this.nomeDaRua + " num. " + this.numeroDaRua + ", " + this.bairro + ", " + this.municipio + "-" + this.estado;
    }
}
