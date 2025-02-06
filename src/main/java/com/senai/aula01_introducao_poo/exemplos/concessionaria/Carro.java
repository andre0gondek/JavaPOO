package com.senai.aula01_introducao_poo.exemplos.concessionaria;

public class Carro {
    float motor;
    String cor;
    String placa;
    String marca;
    String modelo;
    int kmRodados;
    int ano;
    double valor;

    public Carro(float motor, String placa, String cor, String marca, String modelo, int kmRodados, int ano, double valor) {
        this.motor = motor;
        this.placa = placa;
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
        this.kmRodados = kmRodados;
        this.ano = ano;
        this.valor = valor;
    }

    public void testeDrive() {
        System.out.println(modelo + " está em teste de direção...");
    }

    public void comprar(String nomeCliente) {
        System.out.println("O cliente" + nomeCliente + " decidiu comprar o carro " + marca + " " + modelo);
    }

    public void valorTabelaFip() {
        int anoAtual = 2025;
        double valorAtual = valor;
        int anoDiferença = anoAtual - this.ano;

        for (int i = 0; i < anoDiferença; i++) {
            valorAtual -= this.valor*0.02;
        }
        System.out.printf("O %s é atualmente avaliado em: R$%,.2f", modelo, valorAtual);
        System.out.println("\n----------------------------------------");
    }

    @Override
    public String toString() {
        return "O carro " + this.marca + " " + this.modelo + " " + this.ano + " é a combinação perfeita de robustez e sofisticação. " +
                "\nCom motor " + this.motor + " potente e eficiente, ele é ideal para quem busca desempenho e conforto. " +
                "\nO modelo, na elegante cor " + this.cor + ", possui apenas " + this.kmRodados + "km rodados e está pronto para novas aventuras. " +
                "\nPlaca " + this.placa + ", com toda a qualidade e confiança da marca. "
                ;
    }
}
