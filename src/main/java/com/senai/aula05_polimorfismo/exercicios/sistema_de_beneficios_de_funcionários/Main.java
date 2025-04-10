package com.senai.aula05_polimorfismo.exercicios.sistema_de_beneficios_de_funcionários;

public class Main {
    public static void main(String[] args) {
        PlanoDeSaude plano = new PlanoDeSaude();
        plano.descontar(15, 1400);

        ValeAlimentacao va = new ValeAlimentacao();
        va.descontar(10, 1400);

        ValeTransporte vt = new ValeTransporte();
        vt.descontar(5, 1400);
    }
}
