package roteiro6.parte3;

public class TesteConexao {
    public static void main(String[] args) {
        Connection mysql = new MysqlConnection();
        mysql.connect();
        Connection oracle = new OracleConnection();
        oracle.connect();
        Connection sqlServer = new SqlServer();

        ServicoQuarto quarto = new ServicoQuarto(mysql);
        quarto.verificarQuarto();

        ServicoReserva reserva = new ServicoReserva(oracle);
        reserva.criarReserva();

        RelatorioReserva relatorio = new RelatorioReserva(sqlServer);
        relatorio.gerarRelatorio();

    }
}
