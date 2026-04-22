import java.util.Scanner;

public class Escolha {
    public static void main(String[] args) {
    int opcao;
    Scanner sc = new Scanner(System.in);

    while(true){
        System.out.println("Escreva um número de 1 a 4: ");
        opcao = sc.nextInt(); // precisa estar dentro para o usuário reescrever
        switch (opcao){
            case 1:
                System.out.println("Você escolheu 1");
                break; //para somente a escolha
            case 2:
                System.out.println("Você escolheu 2");
                break;
            case 3:
                System.out.println("Você escolheu 3");
                break;
            case 4:
                System.out.println("Você escolheu 4");
                break;
            default:
                System.out.println("Opção Invalida");
                break;
                }
        if (opcao > 0 && opcao <= 4){ //para parar a verdade
            break;
        }
    }
}
}
