import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int maxTahminSayisi = 5; // Kullanıcının maksimum tahmin sayısı
        int tahminSayisi = 0; // Kullanıcının yaptığı tahmin sayısı

        int rastgeleSayi = random.nextInt(101);

        System.out.println("0 ile 100 arasında bir sayı seçildi. Tahmininizi girin:");

        while (tahminSayisi < maxTahminSayisi) {
            int tahmin = scanner.nextInt();
            tahminSayisi++;

            if (tahmin < rastgeleSayi) {
                System.out.println("Daha büyük bir sayı girin.");
            } else if (tahmin > rastgeleSayi) {
                System.out.println("Daha küçük bir sayı girin.");
            } else {
                System.out.println("Tebrikler! Sayıyı doğru tahmin ettiniz: " + rastgeleSayi);


            }
        }

        System.out.println("Üzgünüm! Tahmin hakkınız bitti. Doğru sayı " + rastgeleSayi + " idi.");
    }
}
