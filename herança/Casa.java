public class Casa extends Imovel { // usa para trazer as heranças
    double area;

    public Casa(int id, String endereco, double valor, double area) { // para criar uma herança, precisa e um construtor
        super(id, endereco, valor);
        this.area = area;
    }
    public void imprimeDado(){
        super.imprimeDado(); // traz as informações da Classe Pai
        System.out.println("Área: " + area);
    }
}
