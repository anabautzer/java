public class TestaConta {
    public static void main(String[] args) {
        ContaBancaria cb1 = new ContaBancaria("Ana", 800);
        ContaBancaria cb2 = new ContaBancaria("Pedro", 200); // static muda para todos, por isso não precisa chamar o objeto
        cb1.mostrarDados();
        cb2.mostrarDados();
        cb1.aplicarTaxa();
        cb1.mostrarDados();
        ContaBancaria.alteraTaxa(0.1); // taxa atualizada
        cb1.aplicarTaxa();
        cb2.aplicarTaxa();
        cb1.mostrarDados();
        cb2.mostrarDados();
        ContaBancaria cb3 = new ContaBancaria("Manuel", 800);
        cb3.aplicarTaxa();
        cb3.mostrarDados();
        cb1.setTitular("Amora"); //altera o valor da variavel global
        cb1.mostrarDados();
        System.out.println(cb1.getTitular()); // ele mantem a alteração para sempre, para trocar, dando um novo set




    }
}
