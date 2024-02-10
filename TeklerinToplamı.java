import java.util.Scanner;

public class TeklerinToplamı {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Boolean isTrue = true;
        int toplam=0;

        while (isTrue){
            System.out.println("Sayı gir");
            int sayi = scanner.nextInt();
            if (sayi<0){
                isTrue = false;
            }
            if(sayi%2==1){
                toplam+=sayi;
            }
        }
        System.out.println("Toplam sayı "+toplam);
    }
}
