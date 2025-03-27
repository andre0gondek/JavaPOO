package com.senai.aula04_heranca.exercicios.sistema_de_bibliotecas;

public class LivroFisico extends Livro{
    private int numPaginas;

    public LivroFisico(String autor, String titulo, int numPaginas) {
        super(autor, titulo);
        this.numPaginas = numPaginas;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.printf("Total de páginas: %d\n\n", numPaginas);
    }
}
