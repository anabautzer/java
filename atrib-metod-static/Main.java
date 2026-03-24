//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Estatico e = new Estatico();
        e.soma(5);
        System.out.println(Estatico.resultado);
        Estatico e2 = new Estatico();
        e2.soma(55);
        // variavel resultado é estatico, sendo da classe, não adianta criar novo objeto, não irá zerar valor, atualiza o ultimo valor
        System.out.println(Estatico.resultado); //chama a variavel direto por ser estatico, conteudo da classe
        Estatico e3 = new Estatico();
        e3.soma(7);
        System.out.println(Estatico.resultado);
    }
}