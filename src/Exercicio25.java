public class Exercicio25 {
    public static void main(String[] args) {
        
        long tempo1 = System.nanoTime();
        for (int i = 0; i < 900000000; i++) {
        }
        long tempo2 = System.nanoTime();
        System.out.println("Tempo Total : " + tempo2);
        System.out.println("Tempo em Nanosegundos : " + (tempo2 - tempo1));
    }
}