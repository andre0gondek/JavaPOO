package com.senai.aula04_heranca.exercicios.sistema_de_bibliotecas;

public class LivroDigital extends Livro{
    private double tamanho;

    public LivroDigital(String autor, String titulo, double tamanho) {
        super(autor, titulo);
        this.tamanho = tamanho;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.printf("Tamanho do arquivo: %,.1fMB\n\n", tamanho);
    }
}
