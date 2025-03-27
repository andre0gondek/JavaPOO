package com.senai.aula04_heranca.exercicios.sistema_de_atendimento_medico;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valorConsulta = 200;
        PacienteConvenio paciente1 = new PacienteConvenio("", 0, 40);
        PacienteParticular paciente2 = new PacienteParticular("", 0, 150);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Você possui convenio conosco? s/n");
        String escolha = scanner.nextLine();

        if (escolha.equals("s".toLowerCase())) {
            paciente1.setNome(nome);
            paciente1.setIdade(idade);
            paciente1.aplicarDesconto(valorConsulta);
            System.out.println("Parabéns, " + nome + "! Você recebeu um desconto de R$");

        } else if (escolha.equals("n".toLowerCase())) {
            paciente2.setNome(nome);
            paciente2.setIdade(idade);
            System.out.printf("Olá, %s! Sua consulta ficou R$%d", nome, paciente2.getCustoConsulta());
        }
    }
}
