package com.senai.aula05_polimorfismo.exercicios.sistema_de_reservas_hotel;

public class ReservaVIP extends Reserva{
    private int custoVIP;

    public ReservaVIP(int custoReserva, int custoVIP) {
        super(custoReserva);
        this.custoVIP = custoVIP;
    }

    @Override
    public int calcularCusto(int custoReserva) {
        custoVIP += custoReserva * 4;
        System.out.println("--Reserva VIP--");
        return super.calcularCusto(custoVIP);
    }
}
