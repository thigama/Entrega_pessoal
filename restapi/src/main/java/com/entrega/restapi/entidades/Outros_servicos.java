package com.entrega.restapi.entidades;

import javax.persistence.Column;
import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Outros_servicos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_servico;
    @Column(nullable = false)
    private String nome_servico;
    @Column(nullable = false)
    private String tipo_servico;
    
    public Long getId_servico() {
        return id_servico;
    }
    public void setId_servico(Long id_servico) {
        this.id_servico = id_servico;
    }
    public String getNome_servico() {
        return nome_servico;
    }
    public void setNome_servico(String nome_servico) {
        this.nome_servico = nome_servico;
    }
    public String getTipo_servico() {
        return tipo_servico;
    }
    public void setTipo_servico(String tipo_servico) {
        this.tipo_servico = tipo_servico;
    }
}
