public class Exercicio131 {
    public static void main(String[] args) {
        int contador = 0;
        String saida = "";

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                for (int k = 1; k <= 4; k++) {
                    if (i != j && i != k && j != k) {
                        System.out.println("" + i + j + k);
                        contador += 1; // contador = contador + 1;
                        
                    }
                }
            }
        }
        System.out.println("O número total de três dígitos é : " + contador);
    }
}
