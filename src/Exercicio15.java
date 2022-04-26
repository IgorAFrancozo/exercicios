import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        System.out.println("Insira o número de 1 a 9:  ");
        Scanner leitor = new Scanner(System.in);
        int n = leitor.nextInt();
        int nn = n * 11;
        int nnn = n * 111;
        int resultado;
        if (n >= 10) {
            System.out.println("Valor possui 2 casas decimais !");
        } else {
            resultado = n + nn + nnn;
            System.out.println("\n" + n + " + " + nn + " + " + nnn + " = " + resultado);
            leitor.close();
        }
    }
}