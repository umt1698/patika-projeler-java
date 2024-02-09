import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Boy (metre cinsinden) girin: ");
        double boy = scan.nextDouble();

        System.out.print("Kilo girin: ");
        double kilo = scan.nextDouble();

        double vki = kilo / (boy * boy);

        System.out.println("Vücut Kitle İndeksi: " + vki);
    }
}
