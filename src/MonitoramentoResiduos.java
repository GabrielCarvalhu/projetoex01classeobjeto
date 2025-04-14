public class MonitoramentoResiduos {
    private String tipoResiduo;
    private double quantidade;
    private double dataColeta;
    private boolean statusColeta;
    private String responsavelColeta;

    public MonitoramentoResiduos(){

    }
    public MonitoramentoResiduos(String tipoResiduo, double quantidade, double dataColeta, boolean statusColeta, String responsavelColeta) {
        this.tipoResiduo = tipoResiduo;
        this.quantidade = quantidade;
        this.dataColeta = dataColeta;
        this.statusColeta = statusColeta;
        this.responsavelColeta = responsavelColeta;

    }

    public String getTipoResiduo() {
        return tipoResiduo;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public double getDataColeta() {
        return dataColeta;
    }

    public boolean isStatusColeta() {
        return statusColeta;
    }

    public String getResponsavelColeta() {
        return responsavelColeta;
    }

    public void setTipoResiduo(String tipoResiduo) {
        this.tipoResiduo = tipoResiduo;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public void setDataColeta(double dataColeta) {
        this.dataColeta = dataColeta;
    }

    public void setStatusColeta(boolean statusColeta) {
        this.statusColeta = statusColeta;
    }

    public void setResponsavelColeta(String responsavelColeta) {
        this.responsavelColeta = responsavelColeta;
    }

    public String postartela(String print){
        System.out.println(print);
        return print;
    }

    public double calcularResiduosPorMes( double residuo){
        return residuo;
    }

    public String exibirInformacoes(String exibir){
        return exibir;
    }
}
