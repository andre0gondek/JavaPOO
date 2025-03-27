package com.senai.aula05_polimorfismo.exemplos.sistema_gestao_de_veiculos;

public class Main {
    public static void main(String[] args) {
        realizarManutencao(new Carro("Pejô"));
        realizarManutencao(new Moto("Suzuki"));
        realizarManutencao(new  Caminhao("Mercedes"));
    }
    private static void realizarManutencao(Veiculo veiculo){
        veiculo.realizarManutencao();
    }
}
