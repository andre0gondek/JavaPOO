package com.senai.aula02_colecoes.exemplos.pessoa;

import com.senai.aula01_introducao_poo.exemplos.concessionaria.Carro;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Roger", 20);
        Pessoa pessoa2 = new Pessoa("André", 30);
        Pessoa pessoa3 = new Pessoa("Bruno", 94);
        Pessoa pessoa4 = new Pessoa("Allan", 10);

        Pessoa[] matrizPessoa = new Pessoa[4];

        matrizPessoa[0] = pessoa1;
        matrizPessoa[1] = pessoa2;
        matrizPessoa[2] = pessoa3;
        matrizPessoa[3] = pessoa4;

        for (Pessoa pessoa : matrizPessoa) {
            System.out.println(pessoa);

        }
        matrizPessoa[0].falar("olá!");

        System.out.println(matrizPessoa[3].nome);

        ArrayList lista = new ArrayList(); //lista aleatória

        lista.add(12);
        lista.add(true);
        lista.add("testar");
        lista.add(pessoa1);

        Pessoa pessoa = (Pessoa) lista.get(3);

        pessoa.falar("teste");

        ArrayList<Pessoa> listaPessoas = new ArrayList(); //lista apenas da classe Pessoa
        listaPessoas.add(pessoa1);
        listaPessoas.add(new Pessoa("Pedro",34));

        System.out.println("tamanho da lista: "+listaPessoas.size());

        listar(listaPessoas);
        listaPessoas.remove(pessoa1);
        listar(listaPessoas);

        listaPessoas.set(0,pessoa2);
        listar(listaPessoas);

        listaPessoas.add(0,pessoa3);
    }
    public static void listar(ArrayList<Pessoa> lista){
        for (Pessoa pessoa:lista){
            System.out.println(pessoa);
        }
    }
}
