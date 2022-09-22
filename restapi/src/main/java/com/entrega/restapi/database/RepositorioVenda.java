package com.entrega.restapi.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entrega.restapi.entidades.Venda;

public interface RepositorioVenda extends JpaRepository<Venda,Long> {
    
}
