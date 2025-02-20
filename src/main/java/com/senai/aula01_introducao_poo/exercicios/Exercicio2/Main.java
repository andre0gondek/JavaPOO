package com.senai.aula01_introducao_poo.exercicios.Exercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aluno aluno1 = new Aluno(
                "André",
                0.0f,
                30
        );
        Aluno aluno2 = new Aluno(
                "Bruno",
                0.0f,
                89
        );

        String escolha;
        float notaNova;

        System.out.println("Deseja atualizar a nota do aluno(s/n)?");
        escolha = scanner.nextLine();
        System.out.println("Digite a nova nota.");
        notaNova = scanner.nextFloat();

        aluno1.atualizaNota(escolha, notaNova);
        aluno1.exibirInformacoes();
        boolean aprovacao = aluno1.verificarAprovacao();
        if (aprovacao) {
            System.out.println("O aluno foi aprovado na sua disciplina!");

        } else if (!aprovacao) {
            System.out.println("O aluno foi reprovado na sua disciplina.");
        }

    }
}