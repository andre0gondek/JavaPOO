package com.senai.aula02_colecoes.exercicios.tarefas;

import java.util.ArrayList;

public class Tarefas {
    String nomeTarefa;
    boolean status;

    public Tarefas(String nomeTarefa, boolean status) {
        this.nomeTarefa = nomeTarefa;
        this.status = status;
    }


    public Tarefas(String nomeTarefa) {
        this.nomeTarefa = nomeTarefa;
    }


    //crud
    ArrayList<Tarefas> listaTarefas = new ArrayList<>();

    public void criarTarefa(String nome) {
        listaTarefas.add(new Tarefas(nome));
    }

    public void lerTarefas() {
        for (Tarefas listaTarefa : listaTarefas) {
            System.out.printf("Tarefa: %s \nConcluída= %b \n", listaTarefa.nomeTarefa, listaTarefa.status);
        }
        System.out.println("");//espaço para proxima linha

    }
    public void atualizarTarefa(){
        status = true;
    }
    public void deletarTarefa(int respostaDel){
        listaTarefas.remove(respostaDel);
    }

}


