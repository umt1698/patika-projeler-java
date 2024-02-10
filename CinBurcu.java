import java.util.Scanner;

public class CinBurcu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Doğum yılınızı giriniz: ");
        int sene = scan.nextInt();

        if(sene%12==0){
            System.out.println("Çin zodyağı burcunuz: Maymun");
        } else if (sene%12==1) {
            System.out.println("Çin zodyağı burcunuz: Horoz");
        } else if (sene%12==2) {
            System.out.println("Çin zodyağı burcunuz: Köpek");
        } else if (sene%12==3) {
            System.out.println("Çin zodyağı burcunuz: Domuz");
        } else if (sene%12==4) {
            System.out.println("Çin zodyağı burcunuz: Fare");
        } else if (sene%12==5) {
            System.out.println("Çin zodyağı burcunuz: Öküz");
        } else if (sene%12==6) {
            System.out.println("Çin zodyağı burcunuz: Kaplan");
        } else if (sene%12==7) {
            System.out.println("Çin zodyağı burcunuz: Tavşan");
        } else if (sene%12==8) {
            System.out.println("Çin zodyağı burcunuz: Ejderha");
        } else if (sene%12==9) {
            System.out.println("Çin zodyağı burcunuz: Yılan");
        } else if (sene%12==10) {
            System.out.println("Çin zodyağı burcunuz: At");
        } else {
            System.out.println("Çin zodyağı burcunuz: Koyun");
        }


    }
}
