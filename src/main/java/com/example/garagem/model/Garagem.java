package com.example.garagem.model;

import java.util.*;

public class Garagem{
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome){
        if(nome == null || nome.isEmpty()) System.out.println("Nome não pode ser vazio ou nulo");
        else this.nome = nome;
    }
}

