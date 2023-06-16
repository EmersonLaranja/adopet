package com.alura.adopet.abrigo.entities;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name = "abrigos")
public class Abrigo {
        private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;
        private String nome;
        private @Embedded Endereco endereco;
        private String telefone;
        private String email;
        private String senha;
        private String foto;
        private String sobre;

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getNome() {
                return nome;
        }

        public void setNome(String nome) {
                this.nome = nome;
        }

        public Endereco getEndereco() {
                return endereco;
        }

        public void setEndereco(Endereco endereco) {
                this.endereco = endereco;
        }

        public String getTelefone() {
                return telefone;
        }

        public void setTelefone(String telefone) {
                this.telefone = telefone;
        }

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public String getSenha() {
                return senha;
        }

        public void setSenha(String senha) {
                this.senha = senha;
        }

        public String getFoto() {
                return foto;
        }

        public void setFoto(String foto) {
                this.foto = foto;
        }

        public String getSobre() {
                return sobre;
        }

        public void setSobre(String sobre) {
                this.sobre = sobre;
        }
}
