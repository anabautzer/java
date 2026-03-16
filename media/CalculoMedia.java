import java.util.Scanner;

public class CalculoMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
    double n1 = 0;
    double n2 = 0;
    double n3 = 0;
    double n4 = 0;
    String nome;
        System.out.println("Escreva um nome: ");
            nome = sc.nextLine();
    System.out.println("Digite uma nota 1: ");
        n1 = sc.nextDouble();
    System.out.println("Digite uma nota 2: ");
        n2 = sc.nextDouble();
    System.out.println("Digite uma nota 3: ");
        n3 = sc.nextDouble();
    System.out.println("Digite uma nota 4: ");
        n4 = sc.nextDouble();
        double media = (n1 + n2 + n3 + n4) / 4;
    System.out.println("Nome : " + nome + "\n Média: " + Math.round(media) + "\n"); //arredonda a nota
    System.out.format("Nome: %s \n Média: %.2f", nome, media);
    }
}