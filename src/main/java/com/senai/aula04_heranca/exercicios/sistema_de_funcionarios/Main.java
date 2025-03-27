package com.senai.aula04_heranca.exercicios.sistema_de_funcionarios;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    //Professores

    public static void main(String[] args) {
         Professor professor1 = new Professor("Thiago",6000.0,"Matemática Aplicada");
         Professor professor2 = new Professor("Marco Antônieto", 6000.0,"Noções de Direito");
         Professor professor3 = new Professor("Rafael",6000.0,"LOPAlPython");

         Professor professor4 = new Professor("Alberto",6000.0,"Programação web");
         Professor professor5 = new Professor("Julieta", 6000.0,"Redes");
         Professor professor6 = new Professor("Felipe",6000.0,"Sistema Operacional");

        //Lista de equipes
         ArrayList<String> equipe1 = new ArrayList<>();
         ArrayList<String> equipe2 = new ArrayList<>();

        //Coordenadores
         Coordenador coordenador1 = new Coordenador("Rodrigo",9000, equipe1);
         Coordenador coordenador2 = new Coordenador("Antônio",10000, equipe2);


        //equipe de Professores
        equipe1.add(professor1.getNome());
        equipe1.add(professor2.getNome());
        equipe1.add(professor3.getNome());

        equipe2.add(professor4.getNome());
        equipe2.add(professor5.getNome());
        equipe2.add(professor6.getNome());

        //listas
        System.out.println("--Lista de Professores--");
        System.out.println(professor1);
        System.out.println(professor2);
        System.out.println(professor3);
        System.out.println(professor4);
        System.out.println(professor5);
        System.out.println(professor6);

        System.out.println("--Lista dos Coordenadores--");
        System.out.println(coordenador1);
        System.out.println(coordenador2);
    }
}
