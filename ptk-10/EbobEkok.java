import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("İlk sayıyı girin: ");
        int sayi1 = scanner.nextInt();

        System.out.print("İkinci sayıyı girin: ");
        int sayi2 = scanner.nextInt();

        int ebob = 1;
        int ekok = sayi1 * sayi2;

        // EBOB hesaplama
        int k = 1;
        while (k <= sayi1 && k <= sayi2) {
            if (sayi1 % k == 0 && sayi2 % k == 0) {
                ebob = k;
            }
            k++;
        }

        // EKOK hesaplama
        int i = 1;
        while (i <= sayi1 * sayi2) {
            if (i % sayi1 == 0 && i % sayi2 == 0) {
                ekok = i;
                break;
            }
            i++;
        }

        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);
        scanner.close();
    }
}
