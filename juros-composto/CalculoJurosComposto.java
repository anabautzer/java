
public class CalculoJurosComposto {
    public static void main(String[] args) {
        double c = 1000;
        double t = 0.05;
        double m = 6;
        double resul = c * Math.pow((1 + t), m);
        System.out.println("Capital: R$" + c);
        System.out.println("Taxa de juros: " + t);
        System.out.println("Período de " + m + " meses");
        System.out.printf("Montante final: R$ %.2f%n", resul);
    }
}