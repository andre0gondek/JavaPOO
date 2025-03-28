package com.senai.aula05_polimorfismo.exercicios.sistema_de_relatorios;

import java.io.File;
import java.io.IOException;

public class GerarJSON extends Relatorio{
    public GerarJSON(File relatorio) {
        super(relatorio);
    }

    public void gerar() {
        try {
            if (relatorio.createNewFile()) {
                System.out.println("Relatório em JSON gerado com sucesso!");
            } else {
                System.out.println("Falha ao gerar relatório. Arquivo já existente.");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deletar() {
        super.deletar();
    }
}
