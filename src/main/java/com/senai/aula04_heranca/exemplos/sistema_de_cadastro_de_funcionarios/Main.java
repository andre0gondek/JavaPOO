package com.senai.aula04_heranca.exemplos.sistema_de_cadastro_de_funcionarios;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Nicolas",9000.0);
        Gerente gerente = new Gerente("José", 9000.0, 5000.0);

        funcionario.exibirDados();
        gerente.exibirDados();
    }
}
