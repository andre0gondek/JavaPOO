package com.senai.aula05_polimorfismo.exemplos.sistema_gestao_de_veiculos;

public class Caminhao extends Veiculo{

    public Caminhao(String modelo) {
        super(modelo);
    }

    @Override
    public void realizarManutencao() {
        System.out.println("Manutenção preventiva realizada para o CAMINHÃO: " + getModelo());
    }
}
