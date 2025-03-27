package com.senai.aula05_polimorfismo.exemplos.sistema_de_pagamentos;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pagamentos> pagamentos = new ArrayList<>();

        pagamentos.add(new CLT("Pedro", 1000.0));
        pagamentos.add(new PJ("Rodrigo", 7.5, 300));
        pagamentos.add(new Freelancer("Antonio", 900.7));

        pagamentos.forEach(pagamentos1 ->
                        System.out.printf("%s recebe R$%,.2f\n",
                                pagamentos1.getNome(),
                                pagamentos1.calcularPagamento())
                );

    }
}
