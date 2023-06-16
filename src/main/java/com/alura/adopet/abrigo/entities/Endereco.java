package com.alura.adopet.abrigo.entities;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Embeddable
@Entity
@Table(name = "enderecos")
public record Endereco(@Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id,
                String cidade,
                String estado) {

}
