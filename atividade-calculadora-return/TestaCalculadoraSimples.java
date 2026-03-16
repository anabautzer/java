
public class TestaCalculadoraSimples {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        CalculadoraSimples cs = new CalculadoraSimples();
        System.out.println("Valor da soma é: " + (cs.somar(1,2))); //dando valor para cada vez que utilizar
        int somar = cs.somar(a,b);
        int subtracao = cs.subtracao(a,b);
        int multiplicacao = cs.multiplicacao(a,b);
        int divisao = cs.divisao(a,b);
        System.out.println("A soma: " + somar);
        System.out.println("A subtração: " + subtracao);
        System.out.println("A multiplicação: " + multiplicacao);
        System.out.println("A divisão: " + divisao);
    }
}