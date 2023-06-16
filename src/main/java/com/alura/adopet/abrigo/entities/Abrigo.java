package com.alura.adopet.abrigo.entities;

import com.alura.adopet.abrigo.dto.AbrigoDTO;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "abrigos")

public class Abrigo {
        private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;
        private String nome;
        @OneToOne(cascade = { CascadeType.PERSIST })
        @JoinColumn(name = "endereco_id")
        private Endereco endereco;
        private String telefone;
        private String email;
        private String senha;
        private String foto;
        private String sobre;

        public Abrigo() {
        }

        public Abrigo(AbrigoDTO dadosAbrigo) {
                this.nome = dadosAbrigo.nome();
                this.endereco = new Endereco(dadosAbrigo.endereco());
                this.email = dadosAbrigo.email();
                this.senha = dadosAbrigo.senha();
                this.sobre = dadosAbrigo.sobre();
                this.telefone = dadosAbrigo.telefone();
                this.foto = dadosAbrigo.foto();
        }

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
