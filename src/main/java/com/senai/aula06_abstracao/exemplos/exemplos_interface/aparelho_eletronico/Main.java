package com.senai.aula06_abstracao.exemplos.exemplos_interface.aparelho_eletronico;

public class Main {
    public static void main(String[] args) {
        testarAparelhos(new Televisao());
        testarAparelhos(new Computador());
    }
    public static void testarAparelhos(AparelhoEletronico aparelho){
        System.out.println("...testando aparelhos....");
        aparelho.ligar();
        aparelho.desligar();
    }
}
