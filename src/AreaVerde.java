public class AreaVerde {
    private String nome;
    private String localizacao;
    private String tamanho;
    private String statusConservacao;
    private String responsavel;



    public AreaVerde(){

    }

    public AreaVerde(String nome, String localizacao, String tamanho, String statusConservacao, String responsavel) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.tamanho = tamanho;
        this. statusConservacao = statusConservacao;
        this.responsavel = responsavel;
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

    public String getStatusConservacao() {
        return statusConservacao;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setStatusConservacao(String statusConservacao) {
        this.statusConservacao = statusConservacao;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
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

    public double calcularTamanhoEmHectares(Double hectares){
        return hectares;
    }

    public String exibirInformacoes(String informacoestela){
        return informacoestela;
    }



}
