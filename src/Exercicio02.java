public class Exercicio02 {
    public static void main(String[] args) {
        int resultado = 0;
        int ultimoValor;
        
        for (int i = 0; i <= 1000; i++) {
            ultimoValor = resultado;
            resultado += i;
            System.out.printf("\n" + ultimoValor +" + "+ i + " =  " + resultado);}
    }
}
