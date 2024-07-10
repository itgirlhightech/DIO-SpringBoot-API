package dio.api_basica.controller;

import dio.api_basica.model.Saudacao;
import dio.api_basica.service.SaudacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaudacaoController {

    @Autowired
    private SaudacaoService saudacaoService;

    @GetMapping("/saudacao")
    public Saudacao saudacao(
            @RequestParam(value = "Evilyn", defaultValue = "Feitosa") String nome,
            @RequestParam(value = "imagem", defaultValue = "default.jpg") String imagem) {
        return saudacaoService.criarSaudacao(nome, imagem);
    }
}

