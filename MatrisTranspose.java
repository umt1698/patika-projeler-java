import java.util.Arrays;
import java.util.Scanner;

public class MatrisTranspose {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("N değerini gir: ");
        int N = scanner.nextInt();

        System.out.println("K değerini gir: ");
        int K = scanner.nextInt();

        int[][] arr = new int[N][K];

        for(int i = 0; i< arr.length; i++){
            for (int j= 0;j < arr[i].length; j++){
                System.out.println("Sayı gir: ");
                arr[i][j]= scanner.nextInt();
            }
        }

        for(int[] row: arr){
            for(int column : row){
                System.out.print(column+" ");
            }
            System.out.println();
        }


        System.out.println("Transpozu alınmış hali: ");
        int[][] arrT = new int[K][N];



        for(int i =0; i<K;i++){
            for (int j=0; j<N; j++){
                arrT[i][j] = arr[j][i];
            }
        }

        for(int[] row: arrT){
            for(int column : row){
                System.out.print(column+" ");
            }
            System.out.println();
        }






    }
}
