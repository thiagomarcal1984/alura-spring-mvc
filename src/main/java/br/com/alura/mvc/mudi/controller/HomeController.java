package br.com.alura.mvc.mudi.controller;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.mvc.mudi.model.Pedido;

@Controller
public class HomeController {
    @GetMapping(value = {"/", "/home"})
    public String home(Model model) {
        Pedido pedido = new Pedido();
        pedido.setNomeProduto("Xiamo Redmi Note 8");
        pedido.setUrlImagem("https://m.media-amazon.com/images/I/51RIqTiRc8L._AC_SX679_.jpg");
        pedido.setUrlProduto("https://www.amazon.com.br/Smartphone-Xiaomi-Redmi-Note-Camera/dp/B07Z5BBG56");
        pedido.setDescricao("Uma descrição qualquer para o pedido.");

        pedido.setValorNegociado(new BigDecimal("99999.99"));
        pedido.setDataDaEntrega(LocalDate.parse("2022-01-31"));

        List<Pedido> pedidos = Arrays.asList(pedido);
        model.addAttribute("pedidos", pedidos);

        return "home";
    }
}
