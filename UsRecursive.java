import java.util.Scanner;

public class UsRecursive {

    static int Us(int taban, int us){

        if (us==0){
            return 1;
        }
        else {
            return Us(taban,us-1)*taban;
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Taban değeri giriniz :");
        int taban = scanner.nextInt();

        System.out.println("Üs değeri giriniz :");
        int us = scanner.nextInt();

        System.out.println(Us(taban,us));


    }
}
