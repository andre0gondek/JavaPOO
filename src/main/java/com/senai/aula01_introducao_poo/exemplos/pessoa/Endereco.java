package com.senai.aula01_introducao_poo.exemplos.pessoa;

public class Endereco {
    String nomeDaRua;
    int numeroDaRua;
    String bairro;
    String municipio;
    String estado;

    public Endereco(String estado, String municipio, String bairro, int numeroDaRua, String nomeDaRua) {
        this.estado = estado;
        this.municipio = municipio;
        this.bairro = bairro;
        this.numeroDaRua = numeroDaRua;
        this.nomeDaRua = nomeDaRua;
    }

    @Override
    public String toString() {
        return "Rua " + this.nomeDaRua + " num. " + this.numeroDaRua + ", " + this.bairro + ", " + this.municipio + "-" + this.estado;
    }
}
