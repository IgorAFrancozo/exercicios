public class Exercicio22 {
    public static void main(String[] args) {
        int segundos = 86777;
        int horas = segundos / 3600;
        segundos %= 3600;
        int minutos = segundos / 60;
        segundos %= 60;
        System.out.println("Tempo: " + horas + " Horas, " + minutos + " Minutos, " + segundos + " Segundos.");
    }
}