package com.alura.adopet.abrigo.dto;

import com.alura.adopet.abrigo.entities.Endereco;

public record RespostaCriaEnderecoDTO(
        Long id,
        String cidade,
        String estado) {

    public RespostaCriaEnderecoDTO(Endereco endereco) {
        this(endereco.getId(), endereco.getCidade(), endereco.getEstado());
    }
}
