package com.senai.aula05_polimorfismo.exercicios.sistema_de_reservas_hotel;

public class Reserva {
    private int custoReserva;

    public Reserva(int custoReserva) {
        this.custoReserva = custoReserva;
    }

    public int calcularCusto(int custoReserva) {
        System.out.print("O custo de sua reserva ficou em: R$");
        return custoReserva;
    }
}
