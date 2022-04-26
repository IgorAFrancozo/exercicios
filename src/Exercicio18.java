import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        int valor;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira seu valor: ");
        valor = leitor.nextInt();

        if (valor % 3 == 0) {
            System.out.println("Valor divisível por 3! " + "Resposta: " + valor / 3);
        } else {
            System.out.println("Valor indivisível por 3!");
        }
        if (valor % 5 == 0) {
            System.out.println("Valor divisivel por 5! " + "Resposta: " + valor / 5);
        } else {
            System.out.println("valor indivisível por 3 ou 5");
        }
        leitor.close();
    }
}