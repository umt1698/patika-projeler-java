import java.util.Scanner;

public class KdvBulucu {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double kdv;

        System.out.print("Tutarı girin: ");
        double tutar = scan.nextDouble();

        if (tutar > 0 && tutar <= 1000) {
            kdv = 0.18; // %18 KDV
        } else {
            kdv = 0.08; // %8 KDV
        }


        double kdvliFiyat = tutar * (1 + kdv);
        double kdvTutari = tutar * kdv;


        System.out.println("KDV'siz Fiyat: " + tutar);
        System.out.println("KDV'li Fiyat: " + kdvliFiyat);
        System.out.println("KDV Tutarı: " + kdvTutari);
    }
}
