package com.alura.adopet.abrigo.dto;

import com.alura.adopet.abrigo.entities.Abrigo;

public record RespostaAtualizaAbrigoDTO(
        Long id,
        String nome,
        String telefone,
        String email,
        String foto,
        String sobre,
        RespostaCriaEnderecoDTO endereco) {

    public RespostaAtualizaAbrigoDTO(Abrigo abrigo) {
        this(abrigo.getId(), abrigo.getNome(), abrigo.getTelefone(), abrigo.getEmail(),
                abrigo.getFoto(),
                abrigo.getSobre(),
                new RespostaCriaEnderecoDTO(abrigo.getEndereco()));

    }

}
