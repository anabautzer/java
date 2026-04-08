//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Pessoa p = new Pessoa("Ana", "1234", "rua", "1123", "6543");
        System.out.println(p.getTelefoneComercial());
        System.out.println(p.getTelefone()); // aqui irá retornar apenas a memoria de onde está a informação
        System.out.println(p.getTelefone().getTelefoneComercial());
        p.setTelefoneComercial("090909"); // aqui altera direto
        p.setTelefone(new Telefone("6754", "84523")); // aqui precisa criar um novo objeto para poder alterar
    }
}