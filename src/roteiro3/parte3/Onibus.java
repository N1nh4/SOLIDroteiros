package roteiro3.parte3;

public class Onibus extends VeiculoTransporte {
    private double tarifaBase;
    private double consumoPorKm; // Declaração do campo consumoPorKm

    public Onibus(double tarifaBase, double distancia) {
        super(distancia); // Chama o construtor da classe pai
        this.tarifaBase = tarifaBase;
       
    }

    @Override
    public double calcularTarifa() {
        return tarifaBase * 1.2; // Aumenta 20% para longas distâncias
    }

    @Override
    public double calcularTotalCombustivel(double consumoPorKm) {
        this.consumoPorKm = consumoPorKm; // Define o consumo por km
        return this.consumoPorKm * getDistancia(); // Calcula o total de combustível
    }
}
