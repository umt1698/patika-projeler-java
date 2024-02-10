import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sayı giriniz: ");
        int sayi = scanner.nextInt();
        int basamak = 0;

        int bol_sayi=sayi;

        while (bol_sayi != 0) {
            bol_sayi /= 10;
            basamak++;
        }
        int check=sayi;
        int toplam=0;
        for (int i = 1;i<=basamak;i++){
            int dump = sayi%10;
            int carp =1;
            for(int j =1;j<=basamak;j++ ){

                carp*=dump;
            }
            toplam+=carp;
            sayi/=10;
        }

        if(check==toplam){
            System.out.println("Armstrong");
        }
        else {
            System.out.println("Armstrong değil");
        }


    }
}
