package com.example.garagem.model;

import java.util.Objects;

public class Caminhao extends Veiculos{
    private String modelo;
    private int peso_carga;

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        if(modelo != null && !modelo.isEmpty()){
            this.modelo = modelo;
        }
    }

    public int getPeso_carga(){
        return peso_carga;
    }

    public void setPeso_carga(int peso_carga){
        if(peso_carga > 0){
            this.peso_carga = peso_carga;
        }
    }

    public Caminhao(String modelo, String marca, String cor, int ano_criacao, int peso_carga, String placa){
        super(marca, cor, ano_criacao, placa);
        setModelo(modelo);
        setPeso_carga(peso_carga);
    }
}
