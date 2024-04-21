public class App {
    public static void somaImposto(double taxaImposto, double custo) {
        double imposto = custo * (taxaImposto / 100);
        custo += imposto;
        System.out.println("Custo com imposto: " + custo);
    }

    public static void main(String[] args) throws Exception {
        double taxaImposto = 10;
        double custo = 100; 
        somaImposto(taxaImposto, custo);
    }
}
