package dio.api_basica.controller;


import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
public class ImagemController {

    @GetMapping("/imagem/{nomeImagem }")
    public ResponseEntity<byte[]> obterImagem(@PathVariable String nomeImagem) throws IOException {
        Path caminhoImagem = Paths.get("src/main/resources/static/" + nomeImagem);
        Resource imagem = new ClassPathResource("static/" + nomeImagem);
        if (!imagem.exists()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        byte[] bytes = Files.readAllBytes(caminhoImagem);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", Files.probeContentType(caminhoImagem));

        return new ResponseEntity<>(bytes, headers, HttpStatus.OK);
    }
}
