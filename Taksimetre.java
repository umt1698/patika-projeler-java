

import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double acilisUcreti = 10.0;

        double kmBasinaUcret = 2.20;

        double minimumTutar = 20.0;

        System.out.print("Gidilen mesafeyi(KM) girin: ");
        int mesafe = scan.nextInt();

        double taksimetreTutari = acilisUcreti + (mesafe * kmBasinaUcret);

        if (taksimetreTutari < minimumTutar) {
            taksimetreTutari = minimumTutar;
        }

        System.out.println("Taksimetre Tutarı: " + taksimetreTutari + " TL");
    }
}
