package roteiro6.parte1;

public class RelatorioReserva {
    private MysqlConnection connection;

    public RelatorioReserva() {
        this.connection = new MysqlConnection();
    }

    public void gerarRelatorio() {
        this.connection.connect();
        System.out.println("Lógica de negocio para gerar relatorio de reserva.");
    }
}
