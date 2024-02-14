import java.util.Scanner;

public class AsalRecursive {

    static boolean asalBulucu(int sayi, int bolen) {
        if (bolen == sayi)
            return true;
        if (sayi % bolen == 0)
            return false;
        return asalBulucu(sayi, bolen + 1);
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı giriniz");
        int sayi = scanner.nextInt();

        if (sayi <= 1){
            System.out.println(sayi+" asal sayı değildir");
        }
        else {
            if (asalBulucu(sayi,2)){
                System.out.println(sayi+" asal sayıdır.");
            }
            else {
                System.out.println(sayi+" asal sayı değildir");
            }
        }


    }
}
