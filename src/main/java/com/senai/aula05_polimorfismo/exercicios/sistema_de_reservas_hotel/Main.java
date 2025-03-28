package com.senai.aula05_polimorfismo.exercicios.sistema_de_reservas_hotel;

public class Main {
    public static void main(String[] args) {
        int custo = 50;
        ReservaSimples reserva1 = new ReservaSimples(custo,50);
        ReservaVIP reserva2 = new ReservaVIP(custo,50);

        System.out.println(reserva1.calcularCusto(custo));
        System.out.println(reserva2.calcularCusto(custo));
    }
}
