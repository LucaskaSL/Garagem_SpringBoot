package com.example.garagem.model;

import java.util.*;

public class Garagem{
    private String nome;
    private ArrayList<Carro> carros;
    private ArrayList<Onibus> onibus;
    private ArrayList<Moto> motos;
    private ArrayList<Caminhao> caminhoes;

    public Garagem(){
        this.carros = new ArrayList<>();
        this.onibus = new ArrayList<>();
        this.motos = new ArrayList<>();
        this.caminhoes = new ArrayList<>();
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

    public void remover_carro(Carro carro){
        this.carros.remove(carro);
    }

    public void adicionar_onibus(Onibus onibus){
        if (onibus != null && onibus.getPlaca() != null && !onibus.getPlaca().isEmpty()) {
            this.onibus.add(onibus);
        } else {
            System.out.println("Erro: Não é possível adicionar um onibus sem placa à garagem.");
        }
    }

    public void remover_onibus(Onibus onibus){
        this.onibus.remove(onibus);
    }

    public void adicionar_motos(Moto moto){
        if (motos != null && moto.getPlaca() != null && !moto.getPlaca().isEmpty()) {
            this.motos.add(moto);
        } else {
            System.out.println("Erro: Não é possível adicionar um motos sem placa à garagem.");
        }
    }

    public void remover_motos(Moto moto){
        this.motos.remove(moto);
    }

    public void adicionar_caminhoes(Caminhao caminhao){
        if (caminhoes != null && caminhao.getPlaca() != null && !caminhao.getPlaca().isEmpty()) {
            this.caminhoes.add(caminhao);
        } else {
            System.out.println("Erro: Não é possível adicionar um motos sem placa à garagem.");
        }
    }

    public void remover_caminhao(Caminhao caminhao){
        this.caminhoes.remove(caminhao);
    }

    public List<Carro> getCarros() {
        return carros;
    }
    public List<Onibus> getOnibus() {return onibus;}
    public List<Moto> getMotos() {
        return motos;
    }
    public List<Caminhao> getCaminhoes(){
        return caminhoes;
    }

}

