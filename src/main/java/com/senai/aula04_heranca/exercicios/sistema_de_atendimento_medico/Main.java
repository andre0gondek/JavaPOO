package com.senai.aula04_heranca.exercicios.sistema_de_atendimento_medico;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valorConsulta = 200;
        PacienteConvenio paciente1 = new PacienteConvenio("", 0, 40);
        PacienteParticular paciente2 = new PacienteParticular("", 0, valorConsulta);

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

        } else if (escolha.equals("n".toLowerCase())) {
            paciente2.setNome(nome);
            paciente2.setIdade(idade);
            paciente2.exibirConsulta();
        }
    }
}
