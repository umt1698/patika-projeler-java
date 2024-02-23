import java.util.Scanner;

public class DiziSiralama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizinin boyutunu girin: ");
        int n = scanner.nextInt();

        int[] dizi = new int[n];
        System.out.println("Dizinin elemanlarını girin:");

        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". Elemanı: ");
            dizi[i] = scanner.nextInt();
        }

        Siralama(dizi);

        System.out.print("Sıralama: ");
        for (int eleman : dizi) {
            System.out.print(eleman + " ");
        }


    }

    public static void Siralama(int[] dizi) {
        int n = dizi.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (dizi[j] > dizi[j + 1]) {
                    int temp = dizi[j];
                    dizi[j] = dizi[j + 1];
                    dizi[j + 1] = temp;
                }
            }
        }
    }
}
