package com.alura.adopet.abrigo.entities;

import com.alura.adopet.abrigo.dto.CriaEnderecoDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "enderecos")
public class Endereco {
        private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;
        private String cidade;
        private String estado;

        public Endereco() {
        }

        public Endereco(CriaEnderecoDTO endereco) {
                this.cidade = endereco.cidade();
                this.estado = endereco.estado();
        }

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getCidade() {
                return cidade;
        }

        public void setCidade(String cidade) {
                this.cidade = cidade;
        }

        public String getEstado() {
                return estado;
        }

        public void setEstado(String estado) {
                this.estado = estado;
        }
}
