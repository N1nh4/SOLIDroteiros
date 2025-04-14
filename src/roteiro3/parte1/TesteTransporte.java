package roteiro3.parte1;

public class TesteTransporte {
    public static void main(String[] args) {
        VeiculoTransporte onibus = new Onibus(5.0);
        System.out.println("Tarifa do ônibus: R$ " + onibus.calcularTarifa());
        
        try {
            VeiculoTransporte bicicleta = new Bicicleta();
            System.out.println("Tarifa da bicicleta: R$ " + bicicleta.calcularTarifa());
        } catch (UnsupportedOperationException e) {
            System.out.println("Bicicleta não tem tarifa, então ignoramos esse cálculo.");
        }
      
    }
}
