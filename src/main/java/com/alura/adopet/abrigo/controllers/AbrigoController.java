package com.alura.adopet.abrigo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.alura.adopet.abrigo.dao.AbrigoDAO;
import com.alura.adopet.abrigo.dto.AbrigoDTO;
import com.alura.adopet.abrigo.entities.Abrigo;
import com.alura.adopet.abrigo.repositories.AbrigoRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/abrigos")
public class AbrigoController {

    @Autowired
    private AbrigoRepository repository;
    List<String> abrigos = new ArrayList<String>(); // repository inMemory

    @GetMapping
    public List<Abrigo> listarAbrigos() {
        return repository.findAll();
    }

    @PostMapping
    public ResponseEntity criarAbrigo(@RequestBody @Valid AbrigoDTO dadosAbrigo, UriComponentsBuilder uriBuilder) {
        var abrigo = new Abrigo(dadosAbrigo);

        repository.save(abrigo);
        var uri = uriBuilder.path("/abrigo/{id}").buildAndExpand(abrigo.getId()).toUri();

        return ResponseEntity.created(uri).body(new AbrigoDAO(abrigo));
    }
}
