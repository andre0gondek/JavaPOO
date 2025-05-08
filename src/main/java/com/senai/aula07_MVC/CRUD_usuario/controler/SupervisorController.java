package com.senai.aula07_MVC.CRUD_usuario.controler;

import com.senai.aula07_MVC.CRUD_usuario.model.Supervisor;
import com.senai.aula07_MVC.CRUD_usuario.model.SupervisorDAO;

import java.util.List;

public class SupervisorController {
    private SupervisorDAO supervisorDao = new SupervisorDAO();

    public List<Supervisor> listarSupervisores(){
        return supervisorDao.listar();
    }

    public boolean cadastrarSupervisor(Supervisor supervisor){
        if (supervisor != null) {
            supervisorDao.salvar(supervisor);
            return true;
        }
        return false;
    }
    public boolean atualizarSupervisor(Supervisor supervisor){
        if (supervisor != null) {
            supervisorDao.atualizar(supervisor);
            return true;
        }
        return false;
    }
    public boolean deletarSupervisor(int id){
        if (id >= 0){
            supervisorDao.deletar(id);
            return true;
        }
        return false;
    }
}
