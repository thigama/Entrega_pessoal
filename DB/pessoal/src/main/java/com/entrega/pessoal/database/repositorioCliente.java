package com.entrega.pessoal.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entrega.pessoal.entidades.Cliente;

public interface repositorioCliente extends JpaRepository<Cliente,Long>{

}
