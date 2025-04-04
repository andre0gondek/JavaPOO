package com.senai.aula06_abstracao.exemplos.exemplos_classe_abstrata.gerenciamento_de_funcionarios;

public class Main {
    public static void main(String[] args) {
        testarPagamento(new FuncionarioEfetivo("Jonas", 1234, 4.5));
        testarPagamento(new FuncionarioTemporario("Pedro", 3213, 3, 10.0));
    }
    public  static void testarPagamento(Funcionarios funcionarios){
        System.out.printf("\n---Testando Pagamentos: %s---\n", funcionarios.nome);
        funcionarios.exibirDados();
        funcionarios.aumentarSalario(10);
        funcionarios.exibirDados();
        funcionarios.calcularBonus();
        funcionarios.exibirDados();
    }
}
