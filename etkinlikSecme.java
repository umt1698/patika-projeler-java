import java.util.Scanner;

public class etkinlikSecme {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sıcaklığı giriniz: ");
        int sicaklik = scan.nextInt();

        if(sicaklik<5){
            System.out.println("Kayak yap");
        } else if (sicaklik>=5 && sicaklik<15) {
            System.out.println("Sinemaya git");
        } else if (sicaklik>=15 && sicaklik<25) {
            System.out.println("Piknik yap");

        } else {
            System.out.println("Yüzmeye git");
        }
    }
}
