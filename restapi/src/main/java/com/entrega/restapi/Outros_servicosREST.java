package com.entrega.restapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entrega.restapi.database.RepositorioOutros_servicos;
import com.entrega.restapi.entidades.Outros_servicos;

@RestController
@RequestMapping("/outros_servicos")
public class Outros_servicosREST {
    @Autowired
    private RepositorioOutros_servicos repositorio;

    @GetMapping
    public List<Outros_servicos> listar() {
        return repositorio.findAll();
    }

    @PostMapping
    public void salvar(@RequestBody Outros_servicos outros_servicos) {
        repositorio.save(outros_servicos);
    }

    @PutMapping
    public void alterar(@RequestBody Outros_servicos outros_servicos) {
        if (outros_servicos.getId_servico() > 0)
            repositorio.save(outros_servicos);
    }

    @DeleteMapping
    public void excluir(@RequestBody Outros_servicos outros_servicos) {
        repositorio.delete(outros_servicos);
    }
}
