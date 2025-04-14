package roteiro3.parte4;

public class TesteTransporte {
    public static void main(String[] args) {
        VeiculoTransporte veiculo1 = new Onibus(5.0, 10);
        VeiculoTransporte veiculo2 = new Bicicleta(10); // Agora é um veiculoTransporte valido

        System.out.println("Tarifa do ônibus: R$ " + veiculo1.calcularTarifa());
        System.out.println("Distancia do ônibus: " + veiculo1.getDistancia());

        System.out.println("Tarifa da bicicleta: R$ " + veiculo2.calcularTarifa());
        System.out.println("Distancia da bicicleta: " + veiculo1.getDistancia());
        
        System.out.println("CALCULO DE CONSUMO DA VIAGEM");
        if (veiculo1 instanceof Onibus) {
            System.out.println("Consumo Veiculo 1: " + ((Onibus)veiculo1).calcularTotalCombustivel(12) );
        } else {
            System.out.println("Veiculo 1: Não é um veículo motorizado");
        }
        if (veiculo2 instanceof Onibus) {
            System.out.println("Consumo Total Bicicleta: " + ((Onibus)veiculo2).calcularTotalCombustivel(12) );
        } else {
            System.out.println("Veiculo 2: Não é um veículo motorizado");
        }
      
    }
}
