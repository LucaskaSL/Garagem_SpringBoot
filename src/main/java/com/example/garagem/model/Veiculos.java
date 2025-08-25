package com.example.garagem.model;

import java.util.Objects;

//No java eu não tenho o {get; set;} tenho que fazer o getter e setter separados

public abstract class Veiculos{
    protected String marca;
    protected String cor;
    protected int ano_criacao;
    protected String placa;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca == null || marca.isEmpty()) System.out.println("Desconhecido");
        else this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        if (cor == null || cor.isEmpty()) System.out.println("Cor Desconhecida");
        else this.cor = cor;
    }

    public int getAno_criacao() {
        return ano_criacao;
    }

    public void setAno(int ano) {
        if (ano >= 1900) {
            this.ano_criacao = ano;
        } else {
            this.ano_criacao = 0;
            System.out.println("Não vale carros antes de 1900");
        }
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        if (placa == null || placa.isEmpty()) System.out.println("Desconhecido");
        else this.placa = placa;
    }

    Veiculos(String marca, String cor, int ano_criacao, String placa) {
        setMarca(marca);
        setCor(cor);
        setAno(ano_criacao);
        setPlaca(placa);
    }
}
