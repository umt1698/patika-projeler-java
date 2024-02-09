import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        int Matematik, Fizik, Turkce, Kimya, Muzik;
        Scanner scan = new Scanner(System.in);
        int total = 0;
        int ders_sayisi = 0;

        System.out.println("Matematik notunuzu girin:");
        Matematik = scan.nextInt();
        if (Matematik>=0 && Matematik<=100){
            total+=Matematik;
            ders_sayisi++;
        }


        System.out.println("Fizik notunuzu girin:");
        Fizik = scan.nextInt();
        if (Fizik>=0 && Fizik<=100){
            total+=Fizik;
            ders_sayisi++;
        }

        System.out.println("Türkçe notunuzu girin:");
        Turkce = scan.nextInt();
        if (Turkce>=0 && Turkce<=100){
            total+=Turkce;
            ders_sayisi++;
        }

        System.out.println("Kimya notunuzu girin:");
        Kimya = scan.nextInt();
        if (Kimya>=0 && Kimya<=100){
            total+=Kimya;
            ders_sayisi++;
        }

        System.out.println("Muzik notunuzu girin:");
        Muzik = scan.nextInt();
        if (Muzik>=0 && Muzik<=100){
            total+=Muzik;
            ders_sayisi++;
        }

        double ort = total/ders_sayisi;

        if(ort>55){
            System.out.println("Geçti");
        }else{
            System.out.println("Kaldı");
        }



    }
}
