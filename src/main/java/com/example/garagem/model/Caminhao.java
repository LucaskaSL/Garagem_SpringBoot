package com.example.garagem.model;

import java.util.Objects;

public class Caminhao extends Veiculos{
    private String modelo;
    private int quantidade_portas;

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        if(modelo != null && !modelo.isEmpty()){
            this.modelo = modelo;
        }
    }

    public int getQuantidade_portas(){
        return quantidade_portas;
    }

    public void setQuantidade_portas(int quantidade_portas){
        if(quantidade_portas > 0){
            this.quantidade_portas = quantidade_portas;
        }
    }

    public Caminhao(String modelo, String marca, String cor, int ano_criacao, int quantidade_portas, String placa){
        super(marca, cor, ano_criacao, placa);
        setModelo(modelo);
        setQuantidade_portas(quantidade_portas);
    }
}
