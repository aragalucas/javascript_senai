package com.example.aula.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Nome é obrigatório.")
    private String nome;

    @NotBlank(message = "E-mail é obrigatório.")
    @Email(message = "Deve ser um e-mail válido.")
    private String email;

    @NotBlank(message = "Senha é obrigatória.")
    @Size(min = 3, message = "A senha deve ter no mínimo 3 caracteres.")
    private String senha;

    @NotBlank(message = "Telefone é obrigatório.")
    @Size(min = 8, message = "O telefone deve ter no mínimo 8 caracteres.")
    @Pattern(regexp = "\\d{8}", message = "O telefone deve conter 8 digitos.")
    private String telefone;

    @NotBlank(message = "CPF é obrigatório.")
    @Pattern(regexp = "\\d{11}", message = "O CPF deve conter exatamente 11 dígitos.")
    private String cpf;

    @NotBlank(message = "CEP é obrigatório.")
    @Pattern(regexp = "\\d{8}", message = "O CEP deve conter exatamente 8 dígitos.")
    private String cep;

    public Usuario() {
    }

    public Usuario(Long id, String nome, String email, String senha, String telefone, String cpf, String cep) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
        this.cpf = cpf;
        this.cep = cep;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}