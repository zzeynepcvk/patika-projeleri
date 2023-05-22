import java.util.Scanner;

public class SayiToplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int toplam = 0;
        int girilenSayi;

        do {
            System.out.print("Bir sayı giriniz (Programdan çıkmak için 0'a basın): ");
            girilenSayi = scanner.nextInt();

            if (girilenSayi % 2 == 0 && girilenSayi % 4 == 0) {
                toplam += girilenSayi;
            }
        } while (girilenSayi != 0);

        System.out.println("Toplam: " + toplam);

        scanner.close();
    }
}
