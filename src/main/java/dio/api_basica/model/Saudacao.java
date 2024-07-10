package dio.api_basica.model;

public class Saudacao {

    private String mensagem;
    private String imagemUrl;

    public Saudacao(String mensagem, String imagemUrl) {
        this.mensagem = mensagem;
        this.imagemUrl = imagemUrl;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getImagemUrl() {
        return imagemUrl;
    }

    public void setImagemUrl(String imagemUrl) {
        this.imagemUrl = imagemUrl;
    }
}
