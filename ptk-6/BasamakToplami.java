import java.util.Scanner;

public class BasamakToplami {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        int toplam = 0;
        int kalan;
        while (sayi > 0) {
            kalan = sayi % 10;
            toplam += kalan;
            sayi /= 10;
        }

        System.out.println("Basamakların toplamı: " + toplam);
        scanner.close();
    }
}
