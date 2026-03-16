public class Produto {
    String nome;
    double valor;
    int quantidade;

    void mostrarProduto() {
        double vq = valor * quantidade;
        System.out.println("Produto: " + nome);
        System.out.println("Valor: " + valor);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Total em estoque: " + vq); // ou ("Total em estoque: " + (valor * produto)

    }

    void alterarNome (String novoNome) {
        nome = novoNome; // ou this.nome = nome

    }
    void alterarValor (double novoValor) {
        valor = novoValor;

    }
    void alterarQuantidade (int novaQuantidade) {
        quantidade = novaQuantidade;

    }
}
