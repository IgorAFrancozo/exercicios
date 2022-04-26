import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        int valor1;
        int valor2;
        int valor3;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira o valor 1: ");
        valor1 = leitor.nextInt();
        Scanner leitor2 = new Scanner(System.in);
        System.out.println("Insira o valor 2: ");
        valor2 = leitor.nextInt();
        Scanner leitor3 = new Scanner(System.in);
        System.out.println("Insira o valor 3: ");
        valor3 = leitor.nextInt();

        if (valor1 >= 20 || valor2 >= 20 || valor3 >= 20) {

        }
        if (valor1 < (valor2 - valor3) || valor2 < (valor1 - valor3) || valor3 < (valor1 - valor2)) {
            System.out.println("O resultado é Verdadeiro !");
        } else {
            System.out.println("Falso !");
        }
        leitor.close();
        leitor2.close();
        leitor3.close();
    }
}
