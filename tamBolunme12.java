import java.util.Scanner;

public class tamBolunme12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sayi = scan.nextInt();
        int adet=0 ;
        int toplam=0;

        for (int i=1; i<=sayi;i++){
            if (i%12==0){
                adet++;
                toplam+=i;
            }
        }
        if(adet==0){
            System.out.println("0");
        }
        else{
            System.out.println(toplam/adet);
        }
    }
}
