package roteiro4.parte5;
public abstract class Pagamento {
    public abstract void processarPagamento(double valor);

    //Obriga os filhos a implementarem o método gerarFatura
    public void gerarFatura() {
        System.out.println("Este método não se aplica a esta forma de pagamento.");
    }

    public void validarSaldo() {
        throw new UnsupportedOperationException("Este método de pagamento não suporta validação de saldo");
    }
}