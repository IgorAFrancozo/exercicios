import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Insira sua Senha:  ");
        String senha = ler.next();
        System.out.println("Sua senha é: " + senha);
        ler.close();
    }
}
