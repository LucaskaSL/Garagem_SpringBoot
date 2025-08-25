package com.example.garagem.model;

import java.util.Objects;

//No java eu não tenho o {get; set;} tenho que fazer o getter e setter separados

public abstract class Veiculos implements IVeiculos {
    protected String marca;
    protected String cor;
    protected int ano_criacao;
    protected String placa;

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        if(marca == null || marca.isEmpty()) System.out.println("Desconhecido");
        else this.marca = marca;
    }

    public String getCor(){
        return cor;
    }

    public void setCor(String cor){
        if(cor == null || cor.isEmpty()) System.out.println("Cor Desconhecida");
        else this.cor = cor;
    }

    public int getAno_criacao(){
        return ano_criacao;
    }

    public void setAno(int ano){
        if(ano >= 1900) {
            this.ano_criacao = ano;
        }
        else {
            this.ano_criacao = 0;
            System.out.println("Não vale carros antes de 1900");
        }
    }

    public String getPlaca(){return placa;}

    public void setPlaca(String placa){
        if(placa == null || placa.isEmpty()) System.out.println("Desconhecido");
        else this.placa = placa;
    }

    Veiculos(String marca, String cor, int ano_criacao, String placa) {
        setMarca(marca);
        setCor(cor);
        setAno(ano_criacao);
        setPlaca(placa);
    }

    @Override
    public void exibirDados() {
        System.out.println("Cor: " + getCor());
        System.out.println("Marca: " + getMarca());
        System.out.println("Ano: " + getAno_criacao());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        // Usamos getClass() aqui para garantir que um Carro só possa ser igual a outro Carro
        // e não a uma Moto com os mesmos dados base. É uma abordagem mais estrita.
        if (obj == null || getClass() != obj.getClass()) return false;

        Veiculos other = (Veiculos) obj;
        return this.ano_criacao == other.ano_criacao &&
                Objects.equals(this.placa, other.placa) &&
                Objects.equals(this.marca, other.marca) &&
                Objects.equals(this.cor, other.cor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(placa, marca, cor, ano_criacao);
    }

}
