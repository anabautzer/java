public class Apartamento extends Imovel {
    int andar;

    public Apartamento(int id, String endereco, double valor, int andar) {
        super(id, endereco, valor);
        this.andar = andar;
    }
}

