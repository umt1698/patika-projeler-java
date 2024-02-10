import java.util.Scanner;
public class KullaniciGirisi {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            String dogruSifre = "1234";


            System.out.print("Şifrenizi girin: ");
            String girilenSifre = scanner.nextLine();


            if (girilenSifre.equals(dogruSifre)) {
                System.out.println("Giriş başarılı!");
            } else {
                System.out.println("Hatalı şifre!");

                // Şifre sıfırlama seçeneğini sunalım
                System.out.print("Şifrenizi sıfırlamak ister misiniz? (E/H): ");
                String cevap = scanner.nextLine();

                if (cevap.equalsIgnoreCase("E")) {

                    System.out.print("Yeni şifrenizi girin: ");
                    String yeniSifre = scanner.nextLine();


                    if (!yeniSifre.equals(dogruSifre)) {
                        System.out.println("Şifre oluşturuldu.");
                    } else {
                        System.out.println("Şifre oluşturulamadı, lütfen başka bir şifre giriniz.");
                    }
                } else {
                    System.out.println("Şifre sıfırlama işlemi iptal edildi.");
                }
            }


        }


}
