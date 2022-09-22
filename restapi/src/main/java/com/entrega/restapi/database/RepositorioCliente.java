package com.entrega.restapi.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entrega.restapi.entidades.Cliente;

public interface RepositorioCliente extends JpaRepository<Cliente,Long>{
    
}
