import java.util.Scanner;

public class HesapMakinesiSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("İlk Sayıyı Giriniz");
        int n1 = scanner.nextInt();

        System.out.println("İkinci Sayıyı Giriniz");
        int n2 = scanner.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("İşlem seçiniz: ");
        int islem = scanner.nextInt();

        switch (islem){
            case 1:
                System.out.println(n1+n2);
                break;
            case 2:
                System.out.println(n1-n2);
                break;
            case 3:
                System.out.println(n1*n2);
                break;
            case 4:
                System.out.println(n1/n2);
                break;
            default:
                System.out.println("Hatalı sayı girdiniz");
        }

    }

}
