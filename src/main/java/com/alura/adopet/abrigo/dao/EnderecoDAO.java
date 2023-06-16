package com.alura.adopet.abrigo.dao;

import com.alura.adopet.abrigo.entities.Endereco;

public record EnderecoDAO(
        Long id,
        String cidade,
        String estado) {

    public EnderecoDAO(Endereco endereco) {
        this(endereco.getId(), endereco.getCidade(), endereco.getEstado());
    }
}
