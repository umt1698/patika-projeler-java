import java.util.Scanner;

public class BurcBulma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Doğum ayınızı girin (1-12 arası bir sayı): ");
        int ay = scanner.nextInt();

        System.out.println("Doğum gününüzü girin: ");
        int gun = scanner.nextInt();

        String burc = "";

        switch (ay) {
            case 1:
                if (gun <= 21) {
                    burc = "Oğlak";
                } else {
                    burc = "Kova";
                }
                break;
            case 2:
                if (gun <= 19) {
                    burc = "Kova";
                } else {
                    burc = "Balık";
                }
                break;
            case 3:
                if (gun <= 20) {
                    burc = "Balık";
                } else {
                    burc = "Koç";
                }
                break;
            case 4:
                if (gun <= 20) {
                    burc = "Koç";
                } else {
                    burc = "Boğa";
                }
                break;
            case 5:
                if (gun <= 21) {
                    burc = "Boğa";
                } else {
                    burc = "İkizler";
                }
                break;
            case 6:
                if (gun <= 22) {
                    burc = "İkizler";
                } else {
                    burc = "Yengeç";
                }
                break;
            case 7:
                if (gun <= 22) {
                    burc = "Yengeç";
                } else {
                    burc = "Aslan";
                }
                break;
            case 8:
                if (gun <= 22) {
                    burc = "Aslan";
                } else {
                    burc = "Başak";
                }
                break;
            case 9:
                if (gun <= 22) {
                    burc = "Başak";
                } else {
                    burc = "Terazi";
                }
                break;
            case 10:
                if (gun <= 22) {
                    burc = "Terazi";
                } else {
                    burc = "Akrep";
                }
                break;
            case 11:
                if (gun <= 21) {
                    burc = "Akrep";
                } else {
                    burc = "Yay";
                }
                break;
            case 12:
                if (gun <= 21) {
                    burc = "Yay";
                } else {
                    burc = "Oğlak";
                }
                break;
            default:
                System.out.println("Hatalı ay girişi!");
                return;
        }

        System.out.println("Burcunuz: " + burc);


    }
}
