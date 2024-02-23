import java.util.Scanner;

public class harmonikDizi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizi boyutunu girin: ");
        int n = scanner.nextInt();

        double[] dizi = new double[n];
        System.out.println("Dizinin elemanlarını girin:");
        for (int i = 0; i < n; i++) {
            dizi[i] = scanner.nextDouble();
        }

        double harmonikOrtalama = harmonikOrtalamaHesapla(dizi);
        System.out.println("Dizinin harmonik ortalaması: " + harmonikOrtalama);

        scanner.close();
    }

    public static double harmonikOrtalamaHesapla(double[] dizi) {
        double toplam = 0;
        for (int i = 0; i < dizi.length; i++) {
            toplam += 1 / dizi[i];
        }
        return dizi.length / toplam;
    }
}