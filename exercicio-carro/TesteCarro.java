public class TesteCarro {
    public static void main(String[] args) {
        Carro cr = new Carro();
        System.out.println("Modelo do carro: " + cr.modeloDoCarro("Abroba"));
        System.out.println("Marca do carro: " + cr.marcaDoCarro("Lalanja"));
        System.out.println("Cor do carro: " + cr.corDoCarro("Amarelo"));
    }
}