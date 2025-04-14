public class Main {
    public static void main(String[] args) {

        AreaVerde verde = new AreaVerde();
        verde.setNome("Gabriel");
        verde.setLocalizacao("joinville");
        verde.setTamanho("20");

        MonitoramentoResiduos residuo = new MonitoramentoResiduos();
        residuo.setTipoResiduo("carbono");
        residuo.setQuantidade(20);
        residuo.setDataColeta(20);

        residuo.postartela(verde.getNome());
//        System.out.println(verde.getNome());
//
//        System.out.println(residuo.getTipoResiduo());

    }
}
