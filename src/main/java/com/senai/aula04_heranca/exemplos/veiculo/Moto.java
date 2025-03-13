package com.senai.aula04_heranca.exemplos.veiculo;

public class Moto extends Veiculo{
    private boolean temPartidaEletrica;

    public Moto(String marca, int ano, boolean temPartidaEletrica) {
        super(marca, ano);
        this.temPartidaEletrica = temPartidaEletrica;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("\nPartida elétrica: " +  (temPartidaEletrica? "SIM":"NÃO"));
    }
}
