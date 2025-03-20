package com.senai.aula04_heranca.exercicios.sistema_de_gestao_de_pedidos;

public class PedidoPresencial extends Pedido{
    private int desconto;

    public PedidoPresencial(int numPedido, double valorTotal, int desconto) {
        super(numPedido, valorTotal);
        if (desconto <= 0){
            throw new IllegalArgumentException("O valor do desconto do pedido " + numPedido + " está negativo ou igual a 0 (zero). Reinicie o sistema e atribua um valor maior que 0.");
        } else this.desconto = desconto;
    }
    public void calculoDesconto(){
        double divisao = (double) desconto/100;
        valorTotal -= valorTotal * divisao;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        calculoDesconto();
        System.out.printf("\nDesconto no pedido: %d\nValor total do pedido: R$%,.2f", desconto, valorTotal);
    }
}
