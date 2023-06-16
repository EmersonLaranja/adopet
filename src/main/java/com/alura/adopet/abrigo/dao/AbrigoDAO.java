package com.alura.adopet.abrigo.dao;

import com.alura.adopet.abrigo.entities.Abrigo;

public record AbrigoDAO(
        Long id,
        String nome,
        String telefone,
        String email,
        String foto,
        String sobre,
        EnderecoDAO endereco) {

    public AbrigoDAO(Abrigo abrigo) {
        this(abrigo.getId(), abrigo.getNome(), abrigo.getTelefone(), abrigo.getEmail(),
                abrigo.getFoto(),
                abrigo.getSobre(),
                new EnderecoDAO(abrigo.getEndereco()));

    }

}
