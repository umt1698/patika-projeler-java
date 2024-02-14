import java.util.Scanner;

public class Desen {


    public static void desen(int n, int orijinal) {
        System.out.print(n + " ");

        n -=5;
        while(n!=orijinal && n>0){
            System.out.print(n+" ");
            n-=5;
        }

        while(n!=orijinal ){
            System.out.print(n+" ");
            n+=5;
        }
        System.out.print(n);



    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("N sayısı : ");
        int n = scanner.nextInt();

        System.out.print("Çıktısı : ");
        desen(n, n);



    }
}
