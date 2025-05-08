package com.senai.aula07_MVC.CRUD_usuario.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OperadorDAO {
    private List<Operador> operadores;
    private final String FILE_PATH = "operadores.json";
    private final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    private List<Operador> carregar(){
        try (FileReader reader = new FileReader(FILE_PATH)){
            Type listType = new TypeToken<ArrayList<Operador>>(){}.getType();
            return gson.fromJson(reader, listType);
        }catch (IOException e){
            return new ArrayList<>();
        }
    }
    public OperadorDAO(){
        operadores = carregar();
    }

    public void salvar(Operador operador){
        operadores.add(operador);
        salvarJson();
    }

    public void salvarJson(){
        try (FileWriter writer = new FileWriter(FILE_PATH)){
            gson.toJson(operadores, writer);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public List<Operador> listar(){
        return operadores;
    }

    public boolean deletar(int id) {
        Iterator<Operador> iterator = operadores.iterator();
        while (iterator.hasNext()) {
            Operador o = iterator.next();
            if (o.getId() == id) {
                iterator.remove();
                salvarJson();
                return true;
            }
        }
        return false;
    }
    public void atualizar(Operador operador){
        boolean atualizou = false;
        operadores.forEach(op -> {
            if (op.getId() == operador.getId()){
                op.setNome(operador.getNome());
                op.setSetor(operador.getSetor());
                salvarJson();

            }
        });atualizou = true;

    }
}
