package com.senai.aula05_polimorfismo.exercicios.sistema_de_relatorios;

import java.io.File;

public class Relatorio {
    protected File relatorio;

    public Relatorio(File relatorio) {
        this.relatorio = relatorio;
    }

    public void gerar() {
        System.out.println("Relatório gerado com sucesso!...");
    }

    public void deletar() {
        relatorio.delete();
    }
}
