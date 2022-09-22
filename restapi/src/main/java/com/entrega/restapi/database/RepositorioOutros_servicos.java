package com.entrega.restapi.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entrega.restapi.entidades.Outros_servicos;

public interface RepositorioOutros_servicos extends JpaRepository<Outros_servicos,Long> {
    
}
