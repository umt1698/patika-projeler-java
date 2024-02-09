import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        double armutFiyati = 2.14;
        double elmaFiyati = 3.67;
        double domatesFiyati = 1.11;
        double muzFiyati = 0.95;
        double patlicanFiyati = 5.00;

        Scanner scan = new Scanner(System.in);
        System.out.print("Armut kaç kilogram? : ");
        double armutKg = scan.nextDouble();

        System.out.print("Elma kaç kilogram? : ");
        double elmaKg = scan.nextDouble();

        System.out.print("Domates kaç kilogram? : ");
        double domatesKg = scan.nextDouble();

        System.out.print("Muz kaç kilogram? : ");
        double muzKg = scan.nextDouble();

        System.out.print("Patlıcan kaç kilogram? : ");
        double patlicanKg = scan.nextDouble();

        double toplamTutar = (armutFiyati * armutKg) + (elmaFiyati * elmaKg) + (domatesFiyati * domatesKg)
                + (muzFiyati * muzKg) + (patlicanFiyati * patlicanKg);

        System.out.println("Toplam Tutar: " + toplamTutar + " TL");
    }
}
