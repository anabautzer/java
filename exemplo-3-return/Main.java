//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Exemplo ex = new Exemplo(2,2);
        int quantidade = ex.quantidade();
        double valor = ex.valorTotal();
        System.out.println("Quantidade é: " + quantidade + " Valor: " + valor);
    }
}