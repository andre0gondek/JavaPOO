package com.senai.aula05_polimorfismo.exemplos.sistema_gestao_de_veiculos;

public class Veiculo {
    private String modelo;

    public Veiculo(String modelo) {
        this.modelo = modelo;
    }

    public void realizarManutencao(){
        System.out.println("Manutenção generica");
    }

    public String getModelo() {
        return modelo;
    }
}
