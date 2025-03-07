package com.senai.aula03_encapsulamento.exemplos.gerenciamento_de_funcionarios;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("André", 1320,1);
        System.out.println(funcionario1);


        Funcionario funcionario2 = new Funcionario("",1000, 4);
        System.out.println(funcionario2);

        funcionario1.aumentarSalario(30);
    }
}
