package com.example.garagem.model;

import java.util.*;

public class Garagem{
    private String nome;
    private ArrayList<Carro> carros;
    private ArrayList<Onibus> onibus;
    private ArrayList<Moto> motos;
    private ArrayList<Caminhao> caminhoes;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome){
        if(nome == null || nome.isEmpty()) System.out.println("Nome não pode ser vazio ou nulo");
        else this.nome = nome;
    }

    public List<Carro> getCarros() {return carros;}
    public List<Onibus> getOnibus() {return onibus;}
    public List<Moto> getMotos() {return motos;}
    public List<Caminhao> getCaminhoes(){return caminhoes;}
}

