public class Exercicio18Fori {
    public static void main(String[] args) {



        for (int i = 1; i <= 100; i++) {

            if (i % 3 == 0) {
                System.out.println(i + " = Valor divisível por 3! " + "Divisão = " + i / 3);
            } else {
                System.out.println(i + " = Valor indivisível por 3!");
            }
            if (i % 5 == 0) {
                System.out.println(i + " = Valor divisivel por 5! " + "Divisão = " + i / 5);
            } else {
                System.out.println(i + " = Valor indivisível por 5");
            }
        }
    }
}