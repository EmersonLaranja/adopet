ALTER TABLE abrigos ADD CONSTRAINT fk_enderecos FOREIGN KEY (endereco_id) REFERENCES enderecos(id);
