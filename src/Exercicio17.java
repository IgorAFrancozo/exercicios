import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        int valor;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira seu valor:  ");
        valor = leitor.nextInt();

        if (valor % 2 == 0) {
            System.out.println("Valor = Par");
        } else {
            System.out.println("valor = Impar");
        }
        leitor.close();
    }
}