

import java.util.Scanner;

public class HipotenusBulucu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.print("İlk dik kenar uzunluğunu girin: ");
        int kenar1 = scan.nextInt();

        System.out.print("İkinci dik kenar uzunluğunu girin: ");
        int kenar2 = scan.nextInt();


        double hipotenus = Math.sqrt(kenar1 * kenar1 + kenar2 * kenar2);


        System.out.println("Hipotenüs: " + hipotenus);
        System.out.println("Çevre: "+ (kenar1+kenar2+hipotenus));
        System.out.println("Alan: "+ (kenar1*kenar2)/2);
    }
}
