package com.example.garagem.model;

import java.util.Objects;
public class Carro extends Veiculos{
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

    public Carro(String modelo, String marca, String cor, int ano_criacao, int quantidade_portas, String placa){
        super(marca, cor, ano_criacao, placa);
        setModelo(modelo);
        setQuantidade_portas(quantidade_portas);
    }

    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Modelo: " + getModelo());
        System.out.println("Quantidade de portas: " + getQuantidade_portas());
    }

    @Override
    public boolean equals(Object obj) {
        // 1. Primeiro, verifica se os atributos da superclasse (Veiculo) são iguais.
        // O super.equals já faz as verificações de identidade, nulidade e tipo.
        if (this == obj){
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        // 2. Se a parte do Veiculo for igual, agora compara os atributos específicos do Carro.
        Carro other = (Carro) obj;
        return this.quantidade_portas == other.quantidade_portas &&
                Objects.equals(this.modelo, other.modelo);
    }

    @Override
    public int hashCode() {
        // Combina o hashCode da superclasse com o dos atributos do Carro.
        return Objects.hash(super.hashCode(), modelo, quantidade_portas);
    }

    @Override
    public String toString() {
        // Você pode formatar a string como quiser. Este é um formato comum.
        return "Carro[Placa=" + placa +
                ", Modelo=" + modelo +
                ", Marca=" + marca +
                ", Cor=" + cor +
                ", Ano=" + ano_criacao +
                ", Portas=" + quantidade_portas + "]";
    }
}
