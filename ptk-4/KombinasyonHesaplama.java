import java.util.Scanner;

public class KombinasyonHesaplama {
    public static int faktoriyel(int sayi) {
        int faktoriyel = 1;
        for (int i = 1; i <= sayi; i++) {
            faktoriyel *= i;
        }
        return faktoriyel;
    }

    public static int kombinasyonHesapla(int n, int r) {
        int kombinasyon = faktoriyel(n) / (faktoriyel(r) * faktoriyel(n - r));
        return kombinasyon;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n değerini girin: ");
        int n = scanner.nextInt();
        System.out.print("r değerini girin: ");
        int r = scanner.nextInt();

        int kombinasyon = kombinasyonHesapla(n, r);
        System.out.println("C(" + n + "," + r + ") = " + kombinasyon);

        scanner.close(); 
    }
    
}
