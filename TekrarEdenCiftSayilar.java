import java.util.Arrays;

public class TekrarEdenCiftSayilar {
    public static void main(String[] args) {
        int[] dizi = { 8, 8, 10, 10, 10};

        tekrarEdenCiftSayilariBul(dizi);
    }

    public static void tekrarEdenCiftSayilariBul(int[] dizi) {
        Arrays.sort(dizi);
        int sayi = dizi[0];
        int tekrarSayisi = 1;

        for (int i = 1; i < dizi.length; i++) {
            if (dizi[i] == sayi) {
                tekrarSayisi++;
            }
            else {
                if (sayi % 2 == 0 && tekrarSayisi > 1) {
                    System.out.println(sayi + " sayısı " + tekrarSayisi + " kez tekrar ediyor.");
                }
                sayi = dizi[i];
                tekrarSayisi = 1;
            }
        }


        if (sayi % 2 == 0 && tekrarSayisi > 1) {
            System.out.println(sayi + " sayısı " + tekrarSayisi + " kez tekrar ediyor.");
        }
    }
}