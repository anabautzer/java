//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Imovel i = new Imovel(5,"abroba", 500.50);
    Casa c = new Casa(5,"lalanja", 4040.9, 400);
    i.imprimeDado();
    c.imprimeDado();
    }
}