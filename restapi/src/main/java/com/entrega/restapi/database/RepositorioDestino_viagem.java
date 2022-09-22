package com.entrega.restapi.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entrega.restapi.entidades.Destino_viagem;

public interface RepositorioDestino_viagem extends JpaRepository<Destino_viagem,Long> {
    
}
