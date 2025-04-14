package roteiro3.parte3;

public class TesteTransporte {
    public static void main(String[] args) {
        VeiculoTransporte veiculo1 = new Onibus(5.0,10);
        VeiculoTransporte veiculo2 = new Bicicleta(10); // Agora é um veiculoTransporte valido

        System.out.println("Tarifa Ônibus: R$ " + veiculo1.calcularTarifa());
        System.out.println("Distancia do ônibus: " + veiculo1.getDistancia());
        System.out.println("Consumo Total Ônibus: " + veiculo1.calcularTotalCombustivel(12) );

        System.out.println("Tarifa da bicicleta: R$ " + veiculo2.calcularTarifa());
        System.out.println("Distancia da bicicleta: " + veiculo2.getDistancia());
        System.out.println("Consumo Total Bicicleta: " + veiculo2.calcularTotalCombustivel(12) );
        
      
    }
}
