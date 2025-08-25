package com.example.garagem.model;

import java.util.*;

public class Garagem{
    private String nome;
    private ArrayList<Carro> carros;
    private HashMap<String, Carro> carros_placa;
    private Set<String> marcas_unicas;

    public Garagem(String nome){
        this.nome = nome;
        this.carros = new ArrayList<>();
        this.carros_placa = new HashMap<>();
        this.marcas_unicas = new HashSet<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome){
        if(nome == null || nome.isEmpty()) System.out.println("Nome não pode ser vazio ou nulo");
        else this.nome = nome;
    }

    public void adicionar_carro(Carro carro){
        if (carro != null && carro.getPlaca() != null && !carro.getPlaca().isEmpty()) {
            this.carros.add(carro);
            this.carros_placa.put(carro.getPlaca(), carro);
            this.marcas_unicas.add(carro.getMarca());
        } else {
            System.out.println("Erro: Não é possível adicionar um carro sem placa à garagem.");
        }
    }

    public Carro buscarCarroPorPlaca(String placa){
        return this.carros_placa.get(placa);
    }

    public Set<String> getMarcas_unicas(){
        return this.marcas_unicas;
    }

    public void exibirGaragem(){
        System.out.println("Nome da Garagem: " + getNome());
        if(this.carros.isEmpty()){
            System.out.println("Garagem vazia");
        }

        else{
            System.out.println("Carros da Garagem:");
            for(Carro i : this.carros){
                System.out.println("--------------------");
                i.exibirDados();
            }
        }
    }

    public List<Carro> getCarros() {
        return carros;
    }
}

