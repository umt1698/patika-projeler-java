import java.util.Scanner;

public class palindrome_sayilar {

    public static boolean palindrom(int num) {
        int reverse_num=0;
        int dump = num;
        int basamak=0;
        while(dump>0){
           dump/=10;
           basamak++;
        }
        dump=num;
        while(dump>0){
            int mod = dump%10;
            for (int i=1;i<basamak;i++){
                mod*=10;
            }
            dump/=10;
            reverse_num+=mod;
            basamak--;
        }

        if (reverse_num==num){
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sayı giriniz");
        int sayi = scanner.nextInt();

        if(palindrom(sayi)){
            System.out.println(sayi+" palindrom sayıdır.");
        }
        else {
            System.out.println(sayi+ " palindrom sayı değildir");
        }
    }
}
