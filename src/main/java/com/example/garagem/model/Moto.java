package com.example.garagem.model;

import java.util.Objects;

public class Moto extends Veiculos{
    private int cilindrada;
    private String modelo;

    public int getCilindrada() {
        return cilindrada;
    }

    public int setCilindrada(int cilindrada) {
        if (cilindrada > 0) {
            this.cilindrada = cilindrada;
        }
        return cilindrada;
    }

    public String getModelo() {
        return modelo;
    }

    public String setModelo(String modelo){
        if (modelo != null && !modelo.isEmpty()) {
            this.modelo = modelo;
        }
        return modelo;
    }

    public Moto(String marca, String cor, int ano_criacao, String placa, int cilindrada, String modelo) {
        super(marca, cor, ano_criacao, placa);
        setCilindrada(cilindrada);
        setModelo(modelo);
    }
}
