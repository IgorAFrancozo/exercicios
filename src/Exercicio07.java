public class Exercicio07 {
    public static void main(String[] args) {

        int variavel1 = 5;
        int variavel2 = 10;
        
        System.out.println("O valor da variavel 1 é:  " + variavel1);
        System.out.println("O valor da variavel 2 é:  " + variavel2);
        
        int variavel3 = variavel1;
        variavel1 = variavel2;
        variavel2 = variavel3;

        System.out.println("O valor trocado da variavel 1 é: " + variavel1);
        System.out.println("O valor trocado da variavel 2 é: " + variavel2);
    }
}