public class ContaBancaria {
    private String titular;
    private double saldo;
    static double taxa = 0.02;

    ContaBancaria (String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;

    }

    void depositar(double valor){
        saldo = saldo + valor;
        // saldo += valor

    }
    void sacar(double valor){
        saldo = saldo - valor;
        // saldo -= valor
    }

    void aplicarTaxa(){
        saldo -= saldo * taxa;

    }

    static double alteraTaxa(double novaTaxa){
        return taxa = novaTaxa;

    }
    void mostrarDados() {
        System.out.println("Nome: " + titular + "\n" + "Saldo: " + saldo);
    }

    public void setTitular(String titular){
    if (titular.isEmpty()) { // não irá adicionar, é um meio de proteger a erros
    } else {
        this.titular = titular;
}
    }
    public String getTitular(){ // não precisa ser void por conta de recuperar o dado
        return titular;
    }
}
