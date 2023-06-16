package com.alura.adopet.abrigo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/abrigo")
public class AbrigoController {

    List<String> abrigos = new ArrayList<String>(); // repository inMemory

    @GetMapping
    public List<String> listar() {
        abrigos.add("Abrigo 1");
        return abrigos;
    }
}
