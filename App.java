public class App{
    public static void main(String args[]){
        Placa p1 = new Placa();
        System.out.println(" ---------- DECLARATIONS ----------- ");

        p1.setPais("Brasil");
        p1.setCodigo("ABC1R23");

        Veiculo v = new Veiculo(p1);
        // v.abastece(65);
        // v.dirige(250);

        System.out.println(" -------- EXERCICIOS ( A )--------- ");
        System.out.println("TOTAL TANK: " + v.getTotalTanque());
        // System.out.println("ABASTECE: " + v.abastece(151));
        System.out.println("LITROS COMPRADOS: " + v.abastece(200));


        System.out.println(" -------- EXERCICIOS ( B )--------- ");
        System.out.println("CONSUMO POR LITRO: " + v.verificaConsumoCombustivel());
        System.out.println("ABASTECE VEICULO: " + v.abastece(100));
        System.out.println("AUTONOMIA DO VEICULO: " + v.dirige(300));
        }
}