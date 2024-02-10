import java.util.Scanner;

public class ucakBiletiSorgu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Mesafeyi (KM) girin: ");
        int mesafe = scan.nextInt();

        System.out.print("Yaşınızı girin: ");
        int yas = scan.nextInt();

        System.out.print("Yolculuk tipini girin (1: Tek Yön, 2: Gidiş-Dönüş): ");
        int yolculukTipi = scan.nextInt();

        // Geçerli veri kontrolü
        if (mesafe <= 0 || yas <= 0 || (yolculukTipi != 1 && yolculukTipi != 2)) {
            System.out.println("Hatalı Veri Girdiniz !");
            return;
        }

        double fiyat = mesafe * 0.10;

        // Yaş indirimi
        if (yas < 12)
            fiyat *= 0.5;
        else if (yas >= 12 && yas <= 24)
            fiyat *= 0.9;
        else if (yas >= 65)
            fiyat *= 0.7;

        if (yolculukTipi == 2)
            fiyat *= 0.8;

        System.out.println("Toplam Tutar: " + fiyat + " TL");

        scan.close();
    }
}

