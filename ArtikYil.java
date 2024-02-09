import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Yıl girin: ");
        int yil = scan.nextInt();

        if ((yil % 4 == 0 && yil % 100 != 0) || yil % 400 == 0){
            System.out.println(yil + " artık yıl.");
        }
        else{
            System.out.println(yil+" artık yıl değildir.");
        }
    }
}
