package com.ControleAcessoMundoSENAI.ControleAcesso.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class C_Pessoa {

    @GetMapping("/")
    public String landPage() {
        return "Login/login";
    }

    @PostMapping("/")
    public String LoginPessoa(@RequestParam("usuario") String usuario,
                              @RequestParam("senha") String senha) {
        return "home/home";

    }
}