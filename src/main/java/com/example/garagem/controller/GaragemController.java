package com.example.garagem.controller;

import com.example.garagem.model.Caminhao;
import com.example.garagem.model.Carro;
import com.example.garagem.model.Moto;
import com.example.garagem.model.Onibus;
import com.example.garagem.model.Garagem;
import com.example.garagem.model.Funcionario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class GaragemController {

    private Garagem minhaGaragem;
    Funcionario funcionario = new Funcionario("Roberto", "08037661571", 32, "Masculino", 1500.58);

    public GaragemController() {
        minhaGaragem = new Garagem();
        minhaGaragem.setNome("Garagem do seu Jorge");

        Carro carrinho = new Carro("Uno", "Volkswagen", "Azul", 1989, 4, "ABC-1234");
        Carro carrinho2 = new Carro("Kwid", "Chevrolet", "Preto", 2001, 4, "DEF-5678");
        Carro carrinho3 = new Carro("Fusca", "Volkswagen", "Cinza", 2010, 2, "GHI-9012");
        Onibus onibus = new Onibus("Urbano", "MarcoPolo", "Azul", 2020, 50, "ABC-1234");
        Moto moto = new Moto("Scooter", "Honda", "Vermelha", 1990, 4, "JDK-1234");
        Moto moto2 = new Moto("Bis", "Honda", "Rosa", 1980, 40, "ROS-4321");
        Caminhao caminhao1 = new Caminhao("Actros", "Mercedes", "Preto", 1980, 200, "ROS-4321");
        Caminhao caminhao2 = new Caminhao("Alfa Romeo", "Fiat", "Preto", 1980, 250, "ROS-4321");


        funcionario.adicionar_carro(carrinho);
        funcionario.adicionar_carro(carrinho2);
        funcionario.adicionar_carro(carrinho3);
        //funcionario.remover_carro(carrinho);
        funcionario.adicionar_onibus(onibus);
        //funcionario.remover_onibus(onibus);
        funcionario.adicionar_motos(moto);
        funcionario.adicionar_motos(moto2);
        //funcionario.remover_motos(moto);
        funcionario.adicionar_caminhoes(caminhao1);
        funcionario.adicionar_caminhoes(caminhao2);
        // funcionario.remover_caminhao(caminhao2);
    }

    @GetMapping("/") // Acessar http://localhost:8080/
    public String exibirPaginaDaGaragem(Model model) {

        List<Carro> listaDeCarros = funcionario.getCarros();
        List<Onibus> listaDeOnibus = funcionario.getOnibus();
        List<Moto> listaDeMotos = funcionario.getMotos();
        List<Caminhao> listaDeCaminhoes = funcionario.getCaminhoes();

        //Envia a lista de carros e o nome da garagem para o HTML.
        model.addAttribute("carrosDaGaragem", listaDeCarros);
        model.addAttribute("onibusDaGaragem", listaDeOnibus);
        model.addAttribute("motosDaGaragem", listaDeMotos);
        model.addAttribute("caminhoesDaGaragem", listaDeCaminhoes);
        model.addAttribute("nomeDaGaragem", minhaGaragem.getNome());

        //Diz ao Spring para renderizar o arquivo "index.html".
        return "index";
    }
}