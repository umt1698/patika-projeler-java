import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kaç elemanlı olsun");
        int N = scanner.nextInt();

        System.out.println("kaçlı kombinasyonu olsun");
        int r = scanner.nextInt();

        int sonuc=1;
        for (int i = N; i>=1; i-- ){
            sonuc*=i;
        }

        for (int i = r; i>=1; i-- ){
            sonuc/=i;
        }

        for (int i =(N-r); i>=1; i-- ){
            sonuc/=i;
        }

        System.out.println("Sonuç "+sonuc);
    }
}
