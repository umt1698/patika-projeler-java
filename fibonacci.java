import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kaçıncı seriye kadar gitsin?");
        int num = scanner.nextInt();

        int a=0, b=1;

        for (int i=1; i<=num;i++){
            System.out.print(a+" ");
            int nextTerm=a+b;
            a=b;
            b=nextTerm;

        }
    }
}
