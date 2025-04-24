package roteiro6.parte2;

public class RelatorioReserva {
    private OracleConnection connection;

    public RelatorioReserva() {
        this.connection = new OracleConnection();
    }

    public void gerarRelatorio() {
        this.connection.connect();
        System.out.println("Lógica de negocio para gerar relatorio de reserva.");
    }
}
