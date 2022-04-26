public class Exercicio32 {
    public static void main(String[] args) {
        double a = 8;
        double b = 9;
        double c = 7;
        double d = 4;
        double e = 5;
        double f = 6;
        double media1 = (a + b + c) / 3;
        double media2 = (d + e + f) / 3;
        System.out.println("A primeira média é: " + media1);
        System.out.println("A segunda média é: " + media2);
        double somaDasMedias = media1 + media2;
        System.out.println("A soma das médias é: " + somaDasMedias);
        double mediaDasMedias = (media1 + media2) / 2;
        System.out.println("A média das médias é: " + mediaDasMedias);

    }
}