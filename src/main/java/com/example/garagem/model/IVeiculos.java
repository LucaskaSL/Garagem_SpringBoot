package com.example.garagem.model;

public interface IVeiculos { //interface diz que tudo que "herde" ela terá que ter esses métodos que sofrerão override
                             //a classe que a herde deve ser abstrata, sendo abstrata eu não consigo instanciá-la
                             //ele só serve pra ser uma super classe
    void exibirDados();
}
