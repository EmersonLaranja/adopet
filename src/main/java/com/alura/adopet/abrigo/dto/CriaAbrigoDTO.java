package com.alura.adopet.abrigo.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record CriaAbrigoDTO(
        @NotBlank(message = "O nome do abrigo é obrigatório") String nome,
        @NotBlank(message = "O telefone do abrigo é obrigatório") @Pattern(regexp = "\\d{9,11}") String telefone,
        @NotBlank(message = "O email do abrigo é obrigatório") @Email String email,
        @NotBlank(message = "A senha do abrigo é obrigatório") String senha,
        String foto,
        String sobre,
        CriaEnderecoDTO endereco) {

}
