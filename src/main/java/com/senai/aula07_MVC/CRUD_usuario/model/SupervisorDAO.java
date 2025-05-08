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

public class SupervisorDAO {
    private List<Supervisor> supervisores;
    private final String FILE_PATH = "supervisores.json";
    private final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    private List<Supervisor> carregar(){
        try (FileReader reader = new FileReader(FILE_PATH)){
            Type listType = new TypeToken<ArrayList<Supervisor>>(){}.getType();
            return gson.fromJson(reader, listType);
        }catch (IOException e){
            return new ArrayList<>();
        }
    }
    public SupervisorDAO(){
        supervisores = carregar();
    }

    public void salvar(Supervisor supervisor){
        supervisores.add(supervisor);
        salvarJson();
    }

    public void salvarJson(){
        try (FileWriter writer = new FileWriter(FILE_PATH)){
            gson.toJson(supervisores, writer);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public List<Supervisor> listar(){
        return supervisores;
    }

    public boolean deletar(int id) {
        Iterator<Supervisor> iterator = supervisores.iterator();
        while (iterator.hasNext()) {
            Supervisor s = iterator.next();
            if (s.getId() == id) {
                iterator.remove();
                salvarJson();
                return true;
            }
        }
        return false;
    }
    public void atualizar(Supervisor supervisor){
        boolean atualizou = false;
        supervisores.forEach(op -> {
            if (op.getId() == supervisor.getId()){
                op.setNome(supervisor.getNome());
                op.setArea(supervisor.getArea());
                salvarJson();

            }
        });atualizou = true;

    }
}
