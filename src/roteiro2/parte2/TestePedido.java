package roteiro2.parte2;

import java.util.Arrays;

public class TestePedido {
    public static void main(String[] args) {
        PedidoService pedido = new PedidoService(Arrays.asList("Camiseta", "Calca", "Jaqueta"), new DescontoLivre(0.3));  

       
        pedido.processarPedido(0.1); // 10% de desconto
        
    }
}
