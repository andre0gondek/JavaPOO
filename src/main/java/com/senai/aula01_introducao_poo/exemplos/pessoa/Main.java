package com.senai.aula01_introducao_poo.exemplos.pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Pessoa 1
        Pessoa pessoa1 = new Pessoa(
                "",
                18,
                1.8f,
                new Endereco("Rua Manoel Nóbrega",
                        44,
                        "Jardim Líbano",
                        "São Paulo",
                        "SP"
                )
        );

        //Pessoa 2
        Pessoa pessoa2 = new Pessoa(
                "Bruno",
                90,
                1.2f,
                new Endereco("Rua dos Perdidos",
                        56,
                        "Jardim Botão",
                        "São Paulo",
                        "SP"
                )
        );
        System.out.println(pessoa1.endereco.nomeDaRua);
        pessoa1.falar("Olá!");
        pessoa1.comer("pão de batata");

        System.out.println("-----------------------------------------");

        System.out.println(pessoa2.endereco.nomeDaRua);
        pessoa2.falar("Oh peraí pô");
        pessoa2.comer("Pastel");

        System.out.println("Preencha os dados a seguir: ");
        String[] etiquetas = {"Nome: ", "Idade: ", "Altura: ", "Endereço \n\tRua: ",
                "\tNúmero: ", "\tBairro: ", "\tCidade: ", "\tEstado: "};
        String[] dados = new String[etiquetas.length];

        for (int i = 0; i < etiquetas.length; i++) {
            System.out.print(etiquetas[i]);
            dados[i] = scanner.nextLine();

        }


        Pessoa pessoa3 = new Pessoa(
                dados[0],
                Integer.parseInt(dados[1]),
                Float.parseFloat(dados[2]),
                new Endereco(
                        dados[3],
                        Integer.parseInt(dados[4]),
                        dados[5],
                        dados[6],
                        dados[7]
                )
        );
        System.out.println(pessoa3);
    }
}
