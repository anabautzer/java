public class Main {
    public static void main(String[] args) {
    Produto a = new Produto();
    a.mostrarProduto ();
    a.nome = "Caneta";
    a.valor = 2.5;
    a.quantidade = 10;
    a.mostrarProduto();
    a = new Produto(); // limpa os valores
    a.alterarNome("Banana");
    a.mostrarProduto();
    a.alterarValor(3.5);
    a.mostrarProduto();
    a.alterarQuantidade(20);
    a.mostrarProduto();
    }
}