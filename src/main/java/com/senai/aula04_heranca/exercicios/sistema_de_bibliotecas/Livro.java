package com.senai.aula04_heranca.exercicios.sistema_de_bibliotecas;

public class Livro {
    private String autor;
    private String titulo;

    public Livro(String autor, String titulo) {
        this.autor = autor;
        this.titulo = titulo;
    }

    public void exibirDados() {
        System.out.printf("Título: %s\nAutor: %s\n", titulo, autor);
    }
}
