package com.entrega.restapi.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entrega.restapi.entidades.Passagem;

public interface RepositorioPassagem extends JpaRepository<Passagem,Long>{
    
}
