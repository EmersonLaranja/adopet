package com.alura.adopet.abrigo.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.alura.adopet.abrigo.dto.AtualizaAbrigoDTO;
import com.alura.adopet.abrigo.dto.CriaAbrigoDTO;
import com.alura.adopet.abrigo.dto.RespostaCriaAbrigoDTO;
import com.alura.adopet.abrigo.entities.Abrigo;
import com.alura.adopet.abrigo.repositories.AbrigoRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/abrigos")
public class AbrigoController {

    @Autowired
    private AbrigoRepository repository;
    List<String> abrigos = new ArrayList<String>(); // repository inMemory

    @PostMapping
    public ResponseEntity criarAbrigo(@RequestBody @Valid CriaAbrigoDTO dadosAbrigo, UriComponentsBuilder uriBuilder) {
        var abrigo = new Abrigo(dadosAbrigo);

        repository.save(abrigo);
        var uri = uriBuilder.path("/abrigo/{id}").buildAndExpand(abrigo.getId()).toUri();
        return ResponseEntity.created(uri).body(new RespostaCriaAbrigoDTO(abrigo));

    }

    @GetMapping
    public List<Abrigo> listarAbrigos() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Abrigo> listarAbrigoPorId(@PathVariable Long id) {
        Optional<Abrigo> optionalAbrigo = repository.findById(id);

        if (optionalAbrigo.isPresent()) {
            Abrigo abrigo = optionalAbrigo.get();
            return ResponseEntity.ok(abrigo);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // @PutMapping("/{id}")
    // public ResponseEntity atualizaAbrigo(@RequestBody @Valid AtualizaAbrigoDTO
    // dadosAbrigo,
    // UriComponentsBuilder uriBuilder, @PathVariable Long id) {

    // var abrigo = repository.getReferenceById(id);
    // repository.save(abrigo);
    // var uri =
    // uriBuilder.path("/abrigo/{id}").buildAndExpand(abrigo.getId()).toUri();
    // return ResponseEntity.created(uri).body(new RespostaCriaAbrigoDTO(abrigo));

    // }

    @DeleteMapping("/{id}")
    public ResponseEntity<Abrigo> deletarAbrigoPorId(@PathVariable Long id) {
        Optional<Abrigo> optionalAbrigo = repository.findById(id);

        if (optionalAbrigo.isPresent()) {
            Abrigo abrigo = optionalAbrigo.get();
            repository.delete(abrigo);
            return ResponseEntity.ok(abrigo);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
