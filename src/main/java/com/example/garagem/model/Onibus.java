package com.example.garagem.model;

import java.util.Objects;

public class Onibus extends Veiculos {
    private String modelo;
    private int quantidade_passageiros;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if(modelo != null && !modelo.isEmpty())
            this.modelo = modelo;
    }

    public int getQuantidade_passageiros() {
        return quantidade_passageiros;
    }

    public void setQuantidade_passageiros(int quantidade_passageiros) {
        if(quantidade_passageiros > 0)
            this.quantidade_passageiros = quantidade_passageiros;
    }

    public Onibus(String modelo, String marca, String cor, int ano_criacao, int quantidade_passageiros, String placa) {
        super(marca, cor, ano_criacao, placa);
        setModelo(modelo);
        setQuantidade_passageiros(quantidade_passageiros);
    }
}
