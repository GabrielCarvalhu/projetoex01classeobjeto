import java.util.Scanner;

public class AppSustentabilidade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Cadastro de Área Verde ===");
        System.out.print("Digite o nome da área: ");
        String nomeArea = sc.nextLine();

        System.out.print("Digite a localização da área: ");
        String localizacao = sc.nextLine();

        System.out.print("Digite o tamanho da área (em m²): ");
        String tamanho = sc.nextLine();

        System.out.print("Digite o status de conservação: ");
        String status = sc.nextLine();

        System.out.print("Digite o responsável pela área: ");
        String responsavel = sc.nextLine();

        AreaVerde area = new AreaVerde(nomeArea, localizacao, tamanho, status, responsavel);

        System.out.println("\n=== Monitoramento de Resíduos ===");
        System.out.print("Digite o tipo de resíduo: ");
        String tipoResiduo = sc.nextLine();

        System.out.print("Digite a quantidade de resíduo (em kg): ");
        double quantidade = sc.nextDouble();

        System.out.print("Digite a data da coleta (formato AAAAMMDD): ");
        double dataColeta = sc.nextDouble();
        sc.nextLine();  // consumir quebra de linha

        System.out.print("A coleta foi realizada com sucesso? (true/false): ");
        boolean statusColeta = sc.nextBoolean();
        sc.nextLine();  // consumir quebra de linha

        System.out.print("Digite o nome do responsável pela coleta: ");
        String responsavelColeta = sc.nextLine();

        MonitoramentoResiduos residuos = new MonitoramentoResiduos(
                tipoResiduo, quantidade, dataColeta, statusColeta, responsavelColeta
        );

        // Exibição de resultados
        System.out.println("\n=== RESULTADOS ===");
        System.out.println("Área Verde:");
        System.out.println("Nome: " + area.getNome());
        System.out.println("Localização: " + area.getLocalizacao());
        System.out.println("Tamanho (em m²): " + area.getTamanho());
        System.out.println("Status de Conservação: " + area.getStatusConservacao());
        System.out.println("Responsável: " + area.getResponsavel());
        System.out.println("Tamanho em hectares: " + area.calcularTamanhoEmHectares(Double.parseDouble(area.getTamanho())));

        System.out.println("\nResíduos Monitorados:");
        System.out.println("Tipo: " + residuos.getTipoResiduo());
        System.out.println("Quantidade (kg): " + residuos.getQuantidade());
        System.out.println("Data de Coleta: " + residuos.getDataColeta());
        System.out.println("Status da Coleta: " + (residuos.isStatusColeta() ? "Coletado" : "Pendente"));
        System.out.println("Responsável pela Coleta: " + residuos.getResponsavelColeta());

        sc.close();
    }
}
