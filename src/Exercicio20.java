import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        int valor1;
        int valor2;
        int valor3;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira seu valor 1: ");
        valor1 = leitor.nextInt();
        Scanner leitor2 = new Scanner(System.in);
        System.out.println("Insira seu valor 2: ");
        valor2 = leitor.nextInt();
        Scanner leitor3 = new Scanner(System.in);
        System.out.println("Insira seu valor 3: ");
        valor3 = leitor.nextInt();

        if (valor1 + valor2 == valor3) {
            System.out.println("");
            System.out.println("O resultado da soma do 1º valor + 2º valor é = " + valor3 + "Resultado = Verdadeiro !");
            System.out.println("");
        } else {
            System.out.println("");
            System.out.println("O 3º valor não é a soma do 1º com o 2º valor. Resultado = Falso !");
            System.out.println("");
        }
        leitor.close();
        leitor2.close();
        leitor3.close();
    }
}