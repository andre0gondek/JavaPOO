package com.senai.aula01_introducao_poo.exemplos.pessoa;

public class Main {
    public static void main(String[] args) {

        //Pessoa 1
        Pessoa pessoa1 = new Pessoa(
                "André Mendes",
                18,
                1.8f,
                new Endereco( "SP",
                        "São Paulo",
                        "Jardim Líbano",
                        48,
                        "Rua Manoel Nóbrega"
                )
        );

        //Pessoa 2
        Pessoa pessoa2 = new Pessoa(
                "Bruno",
                90,
                1.2f,
                new Endereco( "SP",
                        "São Paulo",
                        "Jardim Botão",
                        66,
                        "Rua dos Perdidos"
                )
        );

        System.out.println(pessoa1.endereco.nomeDaRua);
        pessoa1.falar("Olá!");
        pessoa1.comer("pão de batata");

        System.out.println("-----------------------------------------");

        System.out.println(pessoa2.endereco.nomeDaRua);
        pessoa2.falar("Oh peraí pô");
        pessoa2.comer("Pastel");

    }
}
