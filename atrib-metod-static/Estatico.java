public class Estatico {
    static int resultado = 0; // estático

    public int soma (int valor){
        resultado = resultado + valor; // resultado += valor (outra forma de fazer a soma direto)
        return resultado;
    }

}
