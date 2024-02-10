import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        int toplam = 0;

        for (int i = 1; i <= sayi ; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }
        }


        if(sayi==1){
            System.out.println(sayi + " mükemmel bir sayı değildir.");
        }

        else if (toplam == sayi) {
            System.out.println(sayi + " mükemmel bir sayıdır.");
        }
        else {
            System.out.println(sayi + " mükemmel bir sayı değildir.");
        }

    }
}
