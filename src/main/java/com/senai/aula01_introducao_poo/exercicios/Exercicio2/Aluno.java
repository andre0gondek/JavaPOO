package com.senai.aula01_introducao_poo.exercicios.Exercicio2;

import java.util.Scanner;

public class Aluno {
    String nome;
    int idade;
    float nota;

    public Aluno(String nome, float nota, int idade) {
        this.nome = nome;
        this.nota = nota;
        this.idade = idade;
    }

    public void exibirInformacoes() {
        System.out.printf("Aluno: %s\nIdade do aluno: %d\nNota do aluno: %f",nome, idade, nota);
    }

    public void atualizaNota(String escolha, float notaNova) {
        if (escolha.equals("s")){
            nota = notaNova;
            System.out.printf("A nova nota do aluno é: %f", nota);
        } else if (escolha.equals("n")) {
            System.out.println("A nota permanecerá a mesma.");
        }
    }

    public void verificarAprovacao() {
        if (nota >= 6.0){
            System.out.println("O aluno foi aprovado na sua disciplina!");
        } else if (nota < 6.0) {
            System.out.println("O aluno foi reprovado na sua disciplina.");
        }
    }

}
