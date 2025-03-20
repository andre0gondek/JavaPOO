package com.senai.aula04_heranca.exercicios.sistema_de_gestao_de_pedidos;

public class Pedido {
    private int numPedido;
    protected double valorTotal;

    public Pedido(int numPedido, double valorTotal) {
        if (numPedido <= 0){
            throw new IllegalArgumentException("O número dos produtos não podem ser negativos ou igual a 0 (zero).");
        } else this.numPedido = numPedido;
        if (valorTotal < 0){
            throw new IllegalArgumentException("O valor do produto não pode ser negativo. Reinicie o sistema e atribua um valor maior ou igual a 0 (zero).");
        } else this.valorTotal = valorTotal;
    }

   public void exibirDados(){
       System.out.printf("Pedido realizado com sucesso! \nNúmero do Pedido: %d \nValor do Pedido: R$%,.2f", numPedido, valorTotal);
   }
}
