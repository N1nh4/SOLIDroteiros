package roteiro6.parte3;

public class OracleConnection implements Connection {
    @Override
    public void connect() {
        System.out.println("Conectando ao banco de dados Oracle...");
    }
}
