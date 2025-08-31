package com.example.garagem.model;

public abstract class Pessoa {
    protected String nome;
    protected String cpf;
    protected int idade;
    protected String sexo;

    public Pessoa(String nome, String cpf, int idade, String sexo) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.sexo = sexo;
    }
}
