import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {
        int numeroDecimal;

        System.out.println("Informe o número que você deseja descobrir o binário:  ");
        Scanner leitor = new Scanner(System.in);
        numeroDecimal = leitor.nextInt();

        String binario = Integer.toBinaryString(numeroDecimal);
        System.out.println(binario);
        leitor.close();
    }
}