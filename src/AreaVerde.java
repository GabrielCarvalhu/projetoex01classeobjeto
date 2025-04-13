public class AreaVerde {
    private String nome;
    private String localizacao;
    private String tamanho;

    public AreaVerde(){

    }

    public AreaVerde(String nome, String localizacao, String tamanho) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.tamanho = tamanho;
    }

    public String getNome() {
        return nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
}
