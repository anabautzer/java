public class Exemplo1 {
    static int variavelTotal; // se tirar o static, a soma fica apenas 5 em vez de 10

    public void somaDeDoisNumeros(){
        variavelTotal = variavelTotal + 5;
    }
    public void subtracaoDeDoisNumeros(){
        variavelTotal = variavelTotal - 5;
    }
    public void multiplicacaoDeDoisNumeros(){
        variavelTotal = variavelTotal * 5;
    }
    public void dividirDeDoisNumeros(){
        variavelTotal = variavelTotal / 5;
    }
}

