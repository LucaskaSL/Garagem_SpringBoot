package com.example.garagem.controller;

import com.example.garagem.model.Carro;
import com.example.garagem.model.Garagem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class GaragemController {

    private Garagem minhaGaragem;

    public GaragemController() {
        minhaGaragem = new Garagem("Coração");

        Carro carrinho = new Carro("Uno", "Volkswagen", "Azul", 1989, 4, "ABC-1234");
        Carro carrinho2 = new Carro("Kwid", "Chevrolet", "Preto", 2001, 4, "DEF-5678");
        Carro carrinho3 = new Carro("Fusca", "Volkswagen", "Cinza", 2010, 3, "GHI-9012");

        minhaGaragem.adicionar_carro(carrinho);
        minhaGaragem.adicionar_carro(carrinho2);
        minhaGaragem.adicionar_carro(carrinho3);
    }

    @GetMapping("/") // Acessar http://localhost:8080/
    public String exibirPaginaDaGaragem(Model model) {

        List<Carro> listaDeCarros = minhaGaragem.getCarros();

        //Envia a lista de carros E o nome da garagem para o HTML.
        model.addAttribute("carrosDaGaragem", listaDeCarros);
        model.addAttribute("nomeDaGaragem", minhaGaragem.getNome());

        //Diz ao Spring para renderizar o arquivo "index.html".
        return "index";
    }
}