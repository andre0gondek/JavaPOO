package com.senai.aula05_polimorfismo.exercicios.sistema_de_reservas_hotel;

public class ReservaSimples extends Reserva{
    private int custoPadrao;

    public ReservaSimples(int custoReserva, int custoPadrao) {
        super(custoReserva);
        this.custoPadrao = custoPadrao;
    }

    @Override
    public int calcularCusto(int custoReserva) {
        custoPadrao += custoReserva;
        System.out.println("--Reserva Simples--");
        return super.calcularCusto(custoPadrao);
    }


}
