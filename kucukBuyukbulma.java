import java.util.Scanner;

public class kucukBuyukbulma {
    public static void main(String[] args) {
        System.out.println("Kaç tane sayı giriceksiniz: ");
        Scanner scan = new Scanner(System.in);
        int adet = scan.nextInt();
        int buyuk=Integer.MIN_VALUE;
        int kucuk=Integer.MAX_VALUE;
        for (int i=1; i<=adet;i++){
            System.out.println(i+". Sayıyı giriniz: ");
            int girilen= scan.nextInt();
            if(girilen>buyuk){
                buyuk=girilen;
            }
            if (girilen<kucuk){
                kucuk=girilen;
            }

        }
        System.out.println("En büyük sayı: "+buyuk);
        System.out.println("En küyük sayı: "+kucuk);

    }
}
