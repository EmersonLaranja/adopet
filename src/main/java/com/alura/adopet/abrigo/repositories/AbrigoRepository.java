package com.alura.adopet.abrigo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alura.adopet.abrigo.entities.Abrigo;

public interface AbrigoRepository extends JpaRepository<Abrigo, Long> {
}