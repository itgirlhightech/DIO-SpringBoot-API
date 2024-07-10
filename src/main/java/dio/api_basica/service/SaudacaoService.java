package dio.api_basica.service;



import dio.api_basica.model.Saudacao;
import org.springframework.stereotype.Service;

@Service
public class SaudacaoService {

    private static final String BASE_URL = "http://localhost:8080/imagem/";

    public Saudacao criarSaudacao(String nome, String imagem) {
        String mensagem = String.format("Olá, %s!", nome);
        String imagemUrl = BASE_URL + imagem;
        return new Saudacao(mensagem, imagemUrl);
    }
}
