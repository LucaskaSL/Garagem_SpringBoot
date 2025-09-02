package com.example.garagem.model;

import java.util.*;

public class Funcionario extends Pessoa {
    private double salario;
    private ArrayList<Carro> carros;
    private ArrayList<Onibus> onibus;
    private ArrayList<Moto> motos;
    private ArrayList<Caminhao> caminhoes;
    private HashSet<String> placas_registradas_carros;
    private HashSet<String> placas_registradas_onibus;
    private HashSet<String> placas_registradas_motos;
    private HashSet<String> placas_registradas_caminhoes;

    public double getSalario(){
        return this.salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public Funcionario(String nome, String cpf, int idade, String sexo, double salario) {
        super(nome, cpf, idade, sexo);
        setSalario(salario);
        this.carros = new ArrayList<>();
        this.onibus = new ArrayList<>();
        this.motos = new ArrayList<>();
        this.caminhoes = new ArrayList<>();
        this.placas_registradas_carros = new HashSet<>();
        this.placas_registradas_onibus = new HashSet<>();
        this.placas_registradas_motos = new HashSet<>();
        this.placas_registradas_caminhoes = new HashSet<>();
    }

    public void adicionar_carro(Carro carro){
        if(carro.getPlaca() == null) {
            System.out.println("Não é possível adicionar um carro sem placa à garagem.");
            return;
        } if (placas_registradas_carros.add(carro.getPlaca())){
            this.carros.add(carro);
            System.out.println("Carro adicionado com sucesso!");
        } else{
            System.out.println("Erro: A placa " + carro.getPlaca() + " já está cadastrada em outro carro.");
        }
    }

    public void remover_carro(Carro carro){
        this.carros.remove(carro);
    }

    public void adicionar_onibus(Onibus onibus){
        if(onibus.getPlaca() == null) {
            System.out.println("Não é possível adicionar um ônibus sem placa à garagem.");
            return;
        } if (placas_registradas_onibus.add(onibus.getPlaca())){
            this.onibus.add(onibus);
            System.out.println("Ônibus adicionado com sucesso!");
        } else{
            System.out.println("Erro: A placa " + onibus.getPlaca() + " já está cadastrada em outro ônibus.");
        }
    }

    public void remover_onibus(Onibus onibus){
        this.onibus.remove(onibus);
    }

    public void adicionar_motos(Moto moto){
        if(moto.getPlaca() == null) {
            System.out.println("Não é possível adicionar uma moto sem placa à garagem.");
            return;
        } if (placas_registradas_motos.add(moto.getPlaca())){
            this.motos.add(moto);
            System.out.println("Moto adicionada com sucesso!");
        } else{
            System.out.println("Erro: A placa " + moto.getPlaca() + " já está cadastrada em outra moto.");
        }
    }

    public void remover_motos(Moto moto){
        this.motos.remove(moto);
    }

    public void adicionar_caminhoes(Caminhao caminhao){
        if(caminhao.getPlaca() == null) {
            System.out.println("Não é possível adicionar um caminhão sem placa à garagem.");
            return;
        } if (placas_registradas_caminhoes.add(caminhao.getPlaca())){
            this.caminhoes.add(caminhao);
            System.out.println("Caminhão adicionado com sucesso!");
        } else{
            System.out.println("Erro: A placa " + caminhao.getPlaca() + " já está cadastrada em outro caminhão.");
        }
    }

    public void remover_caminhao(Caminhao caminhao){
        this.caminhoes.remove(caminhao);
    }

    public List<Carro> getCarros() {return carros;}
    public List<Onibus> getOnibus() {return onibus;}
    public List<Moto> getMotos() {return motos;}
    public List<Caminhao> getCaminhoes(){return caminhoes;}
}
