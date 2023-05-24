import java.util.Scanner;

public class ElmasYapisi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Satır sayısını girin: ");
        int satirSayisi = scanner.nextInt();

        int boslukSayisi = satirSayisi - 1;
        int yildizSayisi = 1;

        // Üst kısım
        for (int i = 1; i <= satirSayisi; i++) {
            for (int j = 1; j <= boslukSayisi; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= yildizSayisi; k++) {
                System.out.print("*");
            }

            System.out.println();

            boslukSayisi--;
            yildizSayisi += 2;
        }

        // Alt kısım
        boslukSayisi = 1;
        yildizSayisi = 2 * satirSayisi - 3;

        for (int i = 1; i <= satirSayisi - 1; i++) {
            for (int j = 1; j <= boslukSayisi; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= yildizSayisi; k++) {
                System.out.print("*");
            }

            System.out.println();

            boslukSayisi++;
            yildizSayisi -= 2;
        }
        scanner.close();
    }
}
