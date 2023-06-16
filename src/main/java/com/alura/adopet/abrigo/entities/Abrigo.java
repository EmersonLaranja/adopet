package com.alura.adopet.abrigo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

import org.springframework.data.annotation.Id;

import com.alura.adopet.abrigo.dto.Endereco;

@Entity
@Table(name = "abrigos")
public record Abrigo(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id,
        String nome,
        Endereco endereco,
        String telefone, String email,
        String senha,
        String foto,
        String sobre) {
}
