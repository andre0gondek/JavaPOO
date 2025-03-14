package com.senai.aula04_heranca.exercicios.sistema_de_funcionarios;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Thiago",6000.0,"Matemática");
        Professor professor2 = new Professor("Marco Antônio", 6000.0,"História");
        Professor professor3 = new Professor("Rafael",6000.0,"LOPAlPython");

        ArrayList<Professor> professores = new ArrayList<>();
        professores.add(professor1);
        professores.add(professor2);
        professores.add(professor3);
    }
}

