package com.example.garagem.model;

import java.util.*;

public class Garagem{
    private String nome;
    private ArrayList<Carro> carros;

    public Garagem(){
        this.carros = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome){
        if(nome == null || nome.isEmpty()) System.out.println("Nome não pode ser vazio ou nulo");
        else this.nome = nome;
    }

    public void adicionar_carro(Carro carro){
        if (carros != null && carro.getPlaca() != null && !carro.getPlaca().isEmpty()) {
            this.carros.add(carro);
        } else {
            System.out.println("Erro: Não é possível adicionar um carro sem placa à garagem.");
        }
    }

    public List<Carro> getCarros() {
        return carros;
    }
}

