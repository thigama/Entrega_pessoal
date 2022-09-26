package com.entrega.restapi.entidades;

import javax.persistence.Column;
import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_cliente;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private long cpf_cliente;
    @Column(nullable = false)
    private long CEP;
    @Column(nullable = false)
    private String logradouro;
    @Column(nullable = false)
    private long num;
    @Column(nullable = false)
    private String email_cliente;
    @Column(nullable = false)
    private long tel_cliente;
    
    public long getId_cliente() {
        return id_cliente;
    }
    public void setId_cliente(long id_cliente) {
        this.id_cliente = id_cliente;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public long getCpf_cliente() {
        return cpf_cliente;
    }
    public void setCpf_cliente(long cpf_cliente) {
        this.cpf_cliente = cpf_cliente;
    }
    public long getCEP() {
        return CEP;
    }
    public void setCEP(long cEP) {
        CEP = cEP;
    }
    public String getLogradouro() {
        return logradouro;
    }
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    public long getNum() {
        return num;
    }
    public void setNum(long num) {
        this.num = num;
    }
    public String getEmail_cliente() {
        return email_cliente;
    }
    public void setEmail_cliente(String email_cliente) {
        this.email_cliente = email_cliente;
    }
    public long getTel_cliente() {
        return tel_cliente;
    }
    public void setTel_cliente(long tel_cliente) {
        this.tel_cliente = tel_cliente;
    }


    
}
