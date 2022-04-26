import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o valor binário:  ");
        String entrada = leitor.next();
        int potencia = 0;
        int decimal = 0;
        for (int i = entrada.length() - 1; i >= 0; i--) {
            decimal += Math.pow(2, potencia) * Character.getNumericValue(entrada.charAt(i));
            potencia++;
            leitor.close();
        }
        System.out.println("O binário convertido em decimal é: " + decimal);

    }
}