package br.com.alura.mvc.mudi.controller;

import javax.servlet.ServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping(value = "hello")
    public String hello(Model model, ServletRequest request) {
        String nome = request.getParameter("nome");
        if (nome == "" || nome == null)
            nome = "Mundo";
        model.addAttribute("nome", nome);
        return "hello";
    }    
}
