package com.senai.aula07_MVC.CRUD_usuario.controler;

import com.senai.aula07_MVC.CRUD_usuario.model.Operador;
import com.senai.aula07_MVC.CRUD_usuario.model.OperadorDAO;

import java.util.List;

public class OperadorController {
        private OperadorDAO operadorDao = new OperadorDAO();

        public List<Operador> listarOperadores(){
            return operadorDao.listar();
        }

        public boolean cadastrarOperador(Operador operador){
            if (operador != null) {
                operadorDao.salvar(operador);
                return true;
            }
            return false;
        }
        public boolean atualizarOperador(Operador operador){
            if (operador != null) {
                operadorDao.atualizar(operador);
                return true;
            }
            return false;
        }
        public boolean deletarOperador(int id){
            if (id >= 0){
                operadorDao.deletar(id);
                return true;
            }
            return false;
    }
}
