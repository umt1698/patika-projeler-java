import java.util.Scanner;

public class gelismisHesapMakinesi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Hesap Makinesi");
            System.out.println("1- Toplama İşlemi");
            System.out.println("2- Çıkarma İşlemi");
            System.out.println("3- Çarpma İşlemi");
            System.out.println("4- Bölme İşlemi");
            System.out.println("5- Üslü Sayı Hesaplama");
            System.out.println("6- Faktoriyel Hesaplama");
            System.out.println("7- Mod Alma");
            System.out.println("8- Dikdörtgen Alan ve Çevre Hesabı");
            System.out.println("0- Çıkış");
            System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");

            int secim = scanner.nextInt();

            if (secim == 0) {
                System.out.println("Programdan çıkılıyor...");
                break;
            }

            double sayi1, sayi2;

            switch (secim) {
                case 1:
                    System.out.print("Toplama için ilk sayıyı giriniz: ");
                    sayi1 = scanner.nextDouble();
                    System.out.print("Toplama için ikinci sayıyı giriniz: ");
                    sayi2 = scanner.nextDouble();
                    System.out.println("Sonuç: " + (sayi1 + sayi2));
                    break;
                case 2:
                    System.out.print("Çıkarma için ilk sayıyı giriniz: ");
                    sayi1 = scanner.nextDouble();
                    System.out.print("Çıkarma için ikinci sayıyı giriniz: ");
                    sayi2 = scanner.nextDouble();
                    System.out.println("Sonuç: " + (sayi1 - sayi2));
                    break;
                case 3:
                    System.out.print("Çarpma için ilk sayıyı giriniz: ");
                    sayi1 = scanner.nextDouble();
                    System.out.print("Çarpma için ikinci sayıyı giriniz: ");
                    sayi2 = scanner.nextDouble();
                    System.out.println("Sonuç: " + (sayi1 * sayi2));
                    break;
                case 4:
                    System.out.print("Bölme için ilk sayıyı giriniz: ");
                    sayi1 = scanner.nextDouble();
                    System.out.print("Bölme için ikinci sayıyı giriniz: ");
                    sayi2 = scanner.nextDouble();
                    if (sayi2 != 0)
                        System.out.println("Sonuç: " + (sayi1 / sayi2));
                    else
                        System.out.println("Bir sayıyı sıfıra bölemezsiniz!");
                    break;
                case 5:
                    System.out.print("Taban sayıyı giriniz: ");
                    sayi1 = scanner.nextDouble();
                    System.out.print("Üs sayıyı giriniz: ");
                    sayi2 = scanner.nextDouble();
                    System.out.println("Sonuç: " + Math.pow(sayi1, sayi2));
                    break;
                case 6:
                    System.out.print("Faktoriyel almak istediğiniz sayıyı giriniz: ");
                    int n = scanner.nextInt();
                    int faktoriyel = 1;
                    for (int i = 1; i <= n; i++) {
                        faktoriyel *= i;
                    }
                    System.out.println("Sonuç: " + faktoriyel);
                    break;
                case 7:
                    System.out.print("Mod almak için ilk sayıyı giriniz: ");
                    int modSayi1 = scanner.nextInt();
                    System.out.print("Mod almak için ikinci sayıyı giriniz: ");
                    int modSayi2 = scanner.nextInt();
                    System.out.println("Sonuç: " + (modSayi1 % modSayi2));
                    break;
                case 8:
                    System.out.print("Dikdörtgenin uzun kenarını giriniz: ");
                    double uzunKenar = scanner.nextDouble();
                    System.out.print("Dikdörtgenin kısa kenarını giriniz: ");
                    double kisaKenar = scanner.nextDouble();
                    double alan = uzunKenar * kisaKenar;
                    double cevre = 2 * (uzunKenar + kisaKenar);
                    System.out.println("Dikdörtgenin Alanı: " + alan);
                    System.out.println("Dikdörtgenin Çevresi: " + cevre);
                    break;
                default:
                    System.out.println("Geçersiz seçim! Lütfen tekrar deneyiniz.");
            }
        }

        scanner.close();
    }
}
