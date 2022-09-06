package com.entrega.pessoal.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Cliente {
    @id_cliente
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_cliente;
    @Column(nullable = false)
    private String email_cliente;
    @Column(nullable = false)
    private String telefone_cliente;
    @Column(nullable = false)
    private int cpf_cliente;
    @Column(nullable = false)
    private String nome_cliente;
    @Column(nullable = false)
    private String endereco_cliente;
    public long getId_cliente() {
        return id_cliente;
    }
    public void setId_cliente(long id_cliente) {
        this.id_cliente = id_cliente;
    }
    public String getEmail_cliente() {
        return email_cliente;
    }
    public void setEmail_cliente(String email_cliente) {
        this.email_cliente = email_cliente;
    }
    public String getTelefone_cliente() {
        return telefone_cliente;
    }
    public void setTelefone_cliente(String telefone_cliente) {
        this.telefone_cliente = telefone_cliente;
    }
    public int getCpf_cliente() {
        return cpf_cliente;
    }
    public void setCpf_cliente(int cpf_cliente) {
        this.cpf_cliente = cpf_cliente;
    }
    public String getNome_cliente() {
        return nome_cliente;
    }
    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }
    public String getEndereco_cliente() {
        return endereco_cliente;
    }
    public void setEndereco_cliente(String endereco_cliente) {
        this.endereco_cliente = endereco_cliente;
    }
    public int getId_venda() {
        return id_venda;
    }
    public void setId_venda(int id_venda) {
        this.id_venda = id_venda;
    }
    private int id_venda;
}
