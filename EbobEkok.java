import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("İlk sayıyı girin: ");
        int sayi1 = scanner.nextInt();

        System.out.print("İkinci sayıyı girin: ");
        int sayi2 = scanner.nextInt();

        int ebob = 1;
        int ekok = (sayi1 * sayi2) / ebob;

        while (sayi1 != sayi2) {
            if (sayi1 > sayi2)
                sayi1 -= sayi2;
            else
                sayi2 -= sayi1;
        }
        ebob = sayi1;

        ekok = (sayi1 * sayi2) / ebob;

        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);

    }
}
