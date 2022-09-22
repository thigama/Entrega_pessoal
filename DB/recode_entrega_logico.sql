drop database if exists recode_entrega;

create database if not exists recode_entrega;

use recode_entrega;

CREATE TABLE cliente (
    id_cliente INT auto_increment not null,
    nome VARCHAR(150) not null,
    cpf_cliente INTEGER not null,
    CEP INT not null,
    logradouro VARCHAR(150) not null,
    num INT not null,
    email_cliente VARCHAR(100) not null,
    tel_cliente INT not null,
    unique (cpf_cliente, email_cliente),
    constraint pk_id_cliente primary key (id_cliente)
    );
    
CREATE TABLE outros_servicos (
    id_servico INT not null auto_increment,
    nome_servico VARCHAR(120) not null,
    tipo_servico VARCHAR(120) not null,
    constraint pk_id_servico primary key (id_servico)
);

CREATE TABLE destino (
    cidade_destino VARCHAR(100) not null,
    pais_destino VARCHAR(100) not null,
    id_destino INT not null auto_increment,
    constraint pk_id_destino primary key (id_destino)
);

CREATE TABLE passagem (
    id_passagem INT not null auto_increment,
    compania_aerea VARCHAR(120) not null,
    id_destino INT not null,
    num_assento INT not null,
    data_embarque DATETIME not null,
    valor_passagem FLOAT not null,
    horario_embarque TIME not null,
    constraint pk_id_passagem primary key (id_passagem),
    constraint fk_passagem_id_destino foreign key (id_destino) references destino (id_destino)
);

CREATE TABLE venda (
    id_venda INT not null auto_increment,
    id_cliente INT not null,
    id_servico INT not null,
    id_passagem INT not null,
    data_venda datetime not null default current_timestamp,
    constraint pk_id_venda primary key (id_venda),
    constraint fk_venda_id_cliente foreign key (id_cliente) references cliente (id_cliente),
    constraint fk_venda_id_servico foreign key (id_servico) references outros_servicos (id_servico),
    constraint fk_venda_id_passagem foreign key (id_passagem) references passagem (id_passagem)
);

insert into destino (cidade_destino, pais_destino) values ('sao paulo', 'Brasil');
insert into destino (cidade_destino, pais_destino) values ('rio de janeiro', 'Brasil');
insert into destino (cidade_destino, pais_destino) values ('paris', 'Franca');

insert into outros_servicos (nome_servico, tipo_servico) values ('aluguel de carro', 'locacao');
insert into outros_servicos (nome_servico, tipo_servico) values ('venda de ingressos parque aquatico', 'venda'); 
insert into outros_servicos (nome_servico, tipo_servico) values ('venda de ingressos circo', 'venda'); 

select * from outros_servicos;