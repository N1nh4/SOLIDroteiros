package roteiro6.parte3;

public class MysqlConnection implements Connection {
    @Override
    public void connect() {
        System.out.println("Conectando ao banco de dados MySQL...");
    }
}
