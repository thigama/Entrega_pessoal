create database if not exists recode_entrega;

use recode_entrega;

CREATE TABLE cliente (
    id_cliente INTEGER PRIMARY KEY auto_increment,
    nome VARCHAR(150) not null,
    cpf_cliente INTEGER not null,
    CEP INTEGER not null,
    logradouro VARCHAR(150) not null,
    num INTEGER not null,
    email_cliente VARCHAR(100) not null,
    tel_cliente INTEGER not null,
    fk_venda_id_venda INTEGER not null,
    UNIQUE (email_cliente, cpf_cliente, id_cliente)
    );

CREATE TABLE venda (
    id_venda INTEGER PRIMARY KEY not null auto_increment,
    cpf_cliente INTEGER not null,
    id_servico INTEGER not null,
    id_passagem INTEGER not null,
    fk_passagem_id_passagem INTEGER not null,
    fk_outros_servicos_id_servico INTEGER not null,
    UNIQUE (cpf_cliente, id_venda, id_servico, id_passagem, fk_passagem_id_passagem, fk_outros_servicos_id_servico)
);

CREATE TABLE outros_servicos (
    id_servico INTEGER PRIMARY KEY UNIQUE not null,
    nome_servico VARCHAR(120) not null,
    tipo_servico VARCHAR(120) not null
);

CREATE TABLE passagem (
    compania_aerea VARCHAR(120) not null,
    id_passagem INTEGER PRIMARY KEY not null,
    id_venda INTEGER not null,
    id_destino INTEGER not null,
    num_assento INTEGER not null,
    data_embarque DATE not null,
    valor_passagem FLOAT not null,
    horario_embarque TIME not null,
    UNIQUE (id_venda, id_destino)
);

CREATE TABLE destino (
    cidade_destino VARCHAR(100) not null,
    pais_destino VARCHAR(100) not null,
    id_destino INTEGER PRIMARY KEY not null,
    fk_passagem_id_passagem INTEGER not null,
    UNIQUE (id_destino, fk_passagem_id_passagem)
);
 
ALTER TABLE cliente ADD CONSTRAINT FK_cliente_2
    FOREIGN KEY (fk_venda_id_venda)
    REFERENCES venda (id_venda)
    ON DELETE RESTRICT;
 
ALTER TABLE venda ADD CONSTRAINT FK_venda_2
    FOREIGN KEY (fk_passagem_id_passagem)
    REFERENCES passagem (id_passagem)
    ON DELETE CASCADE;
 
ALTER TABLE venda ADD CONSTRAINT FK_venda_3
    FOREIGN KEY (fk_outros_servicos_id_servico)
    REFERENCES outros_servicos (id_servico)
    ON DELETE CASCADE;
 
ALTER TABLE destino ADD CONSTRAINT FK_destino_2
    FOREIGN KEY (fk_passagem_id_passagem)
    REFERENCES passagem (id_passagem)
    ON DELETE RESTRICT;
    
    
    select * from recode_entrega;