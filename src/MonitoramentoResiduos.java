public class MonitoramentoResiduos {
    private String tipoResiduo;
    private double quantidade;
    private double dataColeta;

    public MonitoramentoResiduos(){

    }
    public MonitoramentoResiduos(String tipoResiduo, double quantidade, double dataColeta) {
        this.tipoResiduo = tipoResiduo;
        this.quantidade = quantidade;
        this.dataColeta = dataColeta;
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

    public void setTipoResiduo(String tipoResiduo) {
        this.tipoResiduo = tipoResiduo;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public void setDataColeta(double dataColeta) {
        this.dataColeta = dataColeta;
    }
}
