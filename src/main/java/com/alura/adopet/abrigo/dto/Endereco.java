package com.alura.adopet.abrigo.dto;

import org.springframework.data.annotation.Id;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

public record Endereco(@Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id, String cidade, String estado) {

}
