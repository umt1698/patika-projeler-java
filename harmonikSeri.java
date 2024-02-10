import java.util.Scanner;

public class harmonikSeri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input gir: ");
        int input = scanner.nextInt();

        double total = 0;

        for (double i=1; i<=input; i++){
            total+=(1/i);
        }
        System.out.println(total);
    }
}
