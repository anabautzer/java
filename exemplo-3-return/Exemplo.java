public class Exemplo {
    String nome;
    double valor;
    int quantidade;
    Exemplo(double valor, int quantidade) {
        this.valor = valor;
        this.quantidade = quantidade;
    }

    int quantidade () { //é um método, retorna um valor que no caso é inteiro
        return quantidade; //variaveis retornam valores
    }
    double valorTotal() {
        return quantidade * valor;
    }
}
