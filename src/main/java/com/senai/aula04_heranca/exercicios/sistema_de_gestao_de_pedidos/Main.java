package com.senai.aula04_heranca.exercicios.sistema_de_gestao_de_pedidos;

public class Main {
    public static void main(String[] args) {
        PedidoOnline pedido1 = new PedidoOnline(85487, 328.0, 20);
        PedidoPresencial pedido2 = new PedidoPresencial(98954, 987.9, 40);

        pedido1.exibirDados();
        System.out.println("\n-------------------------------------");
        pedido2.exibirDados();
    }
}
