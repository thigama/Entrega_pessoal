package com.entrega.pessoal;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entrega.pessoal.database.repositorioCliente;
import com.entrega.pessoal.entidades.Cliente;

@RestController
@RequestMapping("/src/main/java/com/entrega/pessoal/contatoRest.java")
public class contatoRest {
    @Autowired
    private repositorioCliente rCliente;

    public List<Cliente>listar(){
        return rCliente.findAll();
    }

    public void salvar(Cliente cliente){
        rCliente.save(cliente);
    }

    public void alterar(Cliente cliente){
        if(cliente.getId_cliente()>0)
        rCliente.save(cliente);
    }

    public void excluir(Cliente cliente){
        rCliente.delete(cliente);
    }

}
