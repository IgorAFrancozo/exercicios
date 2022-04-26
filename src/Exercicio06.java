import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        double valor1;
        double valor2;

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o primeiro valor:  ");
        valor1 = ler.nextDouble();
        System.out.println("Digite o segundo valor:  ");
        valor2 = ler.nextDouble();
        if (valor1 == valor2) {
            System.out.println("Os valores não formam um retangulo, e sim um quadrado.");
        } else {
            System.out.println("Area" + valor1 * valor2);
            System.out.println("perimetro" + 2*(valor1 + valor2));
        }
        ler.close();
    }
}