package roteiro6.parte3;

public class RelatorioReserva {
    private Connection connection;

    public RelatorioReserva(Connection c) {
        this.connection = c;
    }

    public void gerarRelatorio() {
        this.connection.connect();
        System.out.println("Lógica de negocio para gerar relatorio de reserva.");
    }
}
