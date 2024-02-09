import java.util.Scanner;

public class DaireAlanÇevre {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double PI = 3.14;

        System.out.print("Dairenin yarı çapını girin: ");
        double r = scan.nextDouble();

        double alan = PI * r * r;
        double cevre = 2 * PI * r;

        System.out.println("Dairenin Alanı: " + alan);
        System.out.println("Dairenin Çevresi: " + cevre);
    }
}
