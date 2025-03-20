package com.senai.aula04_heranca.exercicios.sistema_de_funcionarios;

import java.util.ArrayList;

public class Coordenador extends Funcionario{
    private ArrayList<String> equipeProfessores = new ArrayList<>();

    public Coordenador(String nome, double salario, ArrayList<String> equipeProfessores) {
        super(nome, salario);
        this.equipeProfessores = equipeProfessores;
    }

    @Override
    public String toString() {
        return "\nNome do Coordenador: " + getNome() +
                "\nSalário: " + getSalario() +
                "\nEquipe de professores deste coordenador: " + equipeProfessores +
                "\n---------------------------";
    }
}
