import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        double valor1 ;
        double valor2 ;

        Scanner ler = new Scanner(System.in);
            System.out.println("Digite o valor 1:  ");
                valor1 = ler.nextDouble();
        Scanner ler2 = new Scanner(System.in);
            System.out.println("Digite o valor 2:  ");
                valor2 = ler2.nextDouble();

            System.out.println("Soma: " + valor1 + " + " + valor2 + " = " + (valor1 + valor2));
            System.out.println("Subtração: " + valor1 + " - " + valor2 + " = " + (valor1 - valor2));
            System.out.println("Multiplicação: " + valor1 + " x " + valor2 + " = " + (valor1 * valor2));
            System.out.println("Divisão: " + valor1 + " / " + valor2 + " = " + (valor1 / valor2));
            System.out.println("Mod: " + valor1 + " % " + valor2 + " = " + (valor1 % valor2));
        ler.close();
        ler2.close();
    }
}
