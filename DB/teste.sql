CREATE TABLE cliente 
( 
 id_cliente INT,  
 email_cliente INT,  
 telefone_cliente INT,  
 cpf_cliente INT PRIMARY KEY,  
 sobrenome_cliente INT,  
 endereco_cliente INT,  
 id_venda INT,  
); 

CREATE TABLE destinos 
( 
 id_destino INT PRIMARY KEY,  
 pais_destino INT,  
 cidade_destino INT,  
 id_passagens INT,  
); 

CREATE TABLE passagens 
( 
 id_passagem INT PRIMARY KEY,  
 compania_aerea INT,  
 num_assento INT,  
 horario_embarque INT,  
 data_embarque INT,  
 id_destino INT,  
 valor_passagem INT,  
 id_venda INT,  
); 

CREATE TABLE outros_serviços 
( 
 id_servico INT PRIMARY KEY,  
 nome_servico INT,  
 tipo_servico INT,  
); 

CREATE TABLE venda 
( 
 id_venda INT PRIMARY KEY,  
 cpf_cliente INT,  
 id_servico INT,  
 id_passagem INT,  
 id_passagens INT,  
); 

CREATE TABLE compoe 
( 
 id_servico INT PRIMARY KEY,  
 id_venda INT PRIMARY KEY,  
); 

ALTER TABLE cliente ADD FOREIGN KEY(id_venda) REFERENCES venda (id_venda)
ALTER TABLE destinos ADD FOREIGN KEY(id_passagens) REFERENCES passagens (id_passagens)
ALTER TABLE venda ADD FOREIGN KEY(id_passagens) REFERENCES passagens (id_passagens)
ALTER TABLE compoe ADD FOREIGN KEY(id_servico) REFERENCES outros_serviços (id_servico)
ALTER TABLE compoe ADD FOREIGN KEY(id_venda) REFERENCES venda (id_venda)
