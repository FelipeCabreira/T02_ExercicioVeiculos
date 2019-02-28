public class Veiculo {
    private final double consumoPorLitro = 12;
    private Placa placa;
    private double combustivel;

    public Veiculo(Placa placa) {
        this.placa = placa;
        combustivel = 0;
    }

    public void setPais(String pais) {
        placa.setPais(pais);
    }

    public Placa getPlaca() {
        return placa;
    }

    public double getCombustivelNoTanque() {
        return combustivel;
    }

    public double getTotalTanque() {
        return combustivel = 150;
    }

    public double verificaConsumoCombustivel() {
        return consumoPorLitro;
    }

    public double abastece(double litros) {
        double litrosExcedidos = 0;
        if (litros < getTotalTanque() && litros > 0.0) {
            // if (litros > 0.0) { // Valida Numero Negativo
                combustivel += litros;
            // }
        } else {
            litrosExcedidos = litros - combustivel;
            System.out.println("LITROS EXCEDIDOS ( NÃO CONTABILIZADOS ): " + litrosExcedidos);
            System.out.println("LITROS ABASTECIDOS : " + combustivel);
        }
        return litros;
    }

    public double dirige(double distancia) {
        // Calcula o consumo para a distancia
        double consumo = (distancia / verificaConsumoCombustivel());
        // Diminui o combustivel gasto e retorna a distancia percorrida
        if (combustivel >= consumo) {
            combustivel -= consumo;
            System.out.println("combustivel" + combustivel);
            return distancia;
        } else {
            double distPossivel = combustivel * verificaConsumoCombustivel();
            combustivel = 0.0;
            System.out.println("distPossivel" + distPossivel);
            return distPossivel;
        }
    }

    public String toString() {
        return "Placa: " + getPlaca() + ", combustivel no tanque: " + getCombustivelNoTanque();
    }
}