import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ebob, ekok;

        System.out.printf("n1 sayisini giriniz: ");
        int n1 = input.nextInt();


        System.out.printf("n1 sayisini giriniz: ");
        int n2 = input.nextInt();

        ebob = (n1 < n2) ? n1 : n2;

        while (true) {
            if (n1 % ebob == 0 && n2 % ebob == 0) {
                System.out.printf("%d ve %d sayılarının ebob'u %d'dir.", n1, n2, ebob);
                System.out.println();
                break;
            }
            --ebob;

        }

        ekok = (n1 > n2) ? n1 : n2;

        // Always true
        while(true) {
            if( ekok % n1 == 0 && ekok % n2 == 0 ) {
                System.out.printf("%d ve %d sayılarının ekok'u %d'dir.", n1, n2, ekok);
                break;
            }
            ++ekok;
        }

    }
}