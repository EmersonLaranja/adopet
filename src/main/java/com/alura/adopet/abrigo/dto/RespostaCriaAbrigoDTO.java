package com.alura.adopet.abrigo.dto;

import com.alura.adopet.abrigo.entities.Abrigo;

public record RespostaCriaAbrigoDTO(
        Long id,
        String nome,
        String telefone,
        String email,
        String foto,
        String sobre,
        RespostaCriaEnderecoDTO endereco) {

    public RespostaCriaAbrigoDTO(Abrigo abrigo) {
        this(abrigo.getId(), abrigo.getNome(), abrigo.getTelefone(), abrigo.getEmail(),
                abrigo.getFoto(),
                abrigo.getSobre(),
                new RespostaCriaEnderecoDTO(abrigo.getEndereco()));

    }

}
