package com.entrega.restapi.entidades;

import javax.persistence.Column;
import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Venda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_venda;
    @Column(nullable = false)
    private Long id_cliente;
    @Column(nullable = false)
    private Long id_servico;
    @Column(nullable = false)
    private Long id_passagem;
    @Column(nullable = false)
    private Long data_venda;
    
    public Long getId_venda() {
        return id_venda;
    }
    public void setId_venda(Long id_venda) {
        this.id_venda = id_venda;
    }
    public Long getId_cliente() {
        return id_cliente;
    }
    public void setId_cliente(Long id_cliente) {
        this.id_cliente = id_cliente;
    }
    public Long getId_servico() {
        return id_servico;
    }
    public void setId_servico(Long id_servico) {
        this.id_servico = id_servico;
    }
    public Long getId_passagem() {
        return id_passagem;
    }
    public void setId_passagem(Long id_passagem) {
        this.id_passagem = id_passagem;
    }
    public Long getData_venda() {
        return data_venda;
    }
    public void setData_venda(Long data_venda) {
        this.data_venda = data_venda;
    }
}
