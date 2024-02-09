import java.util.Scanner;

public class NotOrtalaması {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz");
        int matematik = scan.nextInt();

        System.out.println("Fizik notunuzu giriniz");
        int fizik = scan.nextInt();

        System.out.println("Kimya notunuzu giriniz");
        int kimya = scan.nextInt();

        System.out.println("Biyoloji notunuzu giriniz");
        int biyoloji = scan.nextInt();

        System.out.println("Müzik notunuzu giriniz");
        int muzik = scan.nextInt();

        System.out.println("Tarih notunuzu giriniz");
        int tarih = scan.nextInt();

        double not_ort = (matematik+fizik+kimya+biyoloji+muzik+tarih)/6 ;


        String durum = (not_ort > 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(durum);

    }
}
