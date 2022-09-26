package com.entrega.restapi.entidades;

import javax.persistence.Column;
import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Passagem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_passagem;
    @Column(nullable = false)
    private String compania_aerea;
    @Column(nullable = false)
    private Long id_destino;
    @Column(nullable = false)
    private Long num_assento;
    @Column(nullable = false)
    private String data_embarque;
    @Column(nullable = false)
    private Float valor_passagem;
    @Column(nullable = false)
    private String horario_embarque;
    
    public Long getId_passagem() {
        return id_passagem;
    }
    public void setId_passagem(Long id_passagem) {
        this.id_passagem = id_passagem;
    }
    public String getCompania_aerea() {
        return compania_aerea;
    }
    public void setCompania_aerea(String compania_aerea) {
        this.compania_aerea = compania_aerea;
    }
    public Long getId_destino() {
        return id_destino;
    }
    public void setId_destino(Long id_destino) {
        this.id_destino = id_destino;
    }
    public Long getNum_assento() {
        return num_assento;
    }
    public void setNum_assento(Long num_assento) {
        this.num_assento = num_assento;
    }
    public String getData_embarque() {
        return data_embarque;
    }
    public void setData_embarque(String data_embarque) {
        this.data_embarque = data_embarque;
    }
    public Float getValor_passagem() {
        return valor_passagem;
    }
    public void setValor_passagem(Float valor_passagem) {
        this.valor_passagem = valor_passagem;
    }
    public String getHorario_embarque() {
        return horario_embarque;
    }
    public void setHorario_embarque(String horario_embarque) {
        this.horario_embarque = horario_embarque;
    }
}
