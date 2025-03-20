package com.senai.aula04_heranca.exercicios.sistema_de_gestao_de_pedidos;

public class PedidoOnline extends Pedido {
    private int taxaEntrega;

    public PedidoOnline(int numPedido, double valorTotal, int taxaEntrega) {
        super(numPedido, valorTotal);
        if (taxaEntrega < 0){
            throw new IllegalArgumentException("O valor da taxa do pedido " + numPedido + " está negativo. Reinicie o sistema e atribua um valor maior ou igual a 0 (zero).");
        }
        this.taxaEntrega = taxaEntrega;
    }
    public void calculoTaxa(){
        double divisao = (double) taxaEntrega/100;
        valorTotal += valorTotal * divisao;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        calculoTaxa();
        System.out.printf("\nTaxa de entrega: %d\nValor total do pedido: R$%,.2f", taxaEntrega, valorTotal);
    }
}