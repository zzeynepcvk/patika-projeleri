import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {
    public static void main(String[] args) {
        Random rand = new Random();
        int sayi = rand.nextInt(100);

        Scanner input = new Scanner(System.in);
        System.out.print("Tahmin hakkınızı giriniz: ");
        int hak = input.nextInt();

        int dogruTahmin = 0;
        int secilenSayi;
        int[] yanlislar = new int[hak];
        boolean kazandi = false;
        boolean hataliGiris = false;


        while (dogruTahmin < hak) {
            System.out.print("Lütfen tahmininizi giriniz: ");
            secilenSayi = input.nextInt();

            if (secilenSayi < 0 || secilenSayi > 99) {
                System.out.println("Lütfen 0-100 arasında bir değer giriniz.");
                if (hataliGiris) {
                    dogruTahmin++;
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hakkınız: " + (hak - dogruTahmin));
                } else {
                    hataliGiris = true;
                    System.out.println("Bir daha hatalı girişinizde hakkınızdan düşülecektir.");
                }
                continue;
            }

            if (secilenSayi == sayi) {
                System.out.println("Tebrikler, doğru tahmin ettiniz! Tahmin ettiğiniz sayı: " + sayi);
                kazandi = true;
                break;
            } else {
                System.out.println("Hatalı bir sayı girdiniz!");
                if (secilenSayi > sayi) {
                    System.out.println(secilenSayi + " sayısı, gizli sayıdan büyüktür.");
                } else {
                    System.out.println(secilenSayi + " sayısı, gizli sayıdan küçüktür.");
                }

                yanlislar[dogruTahmin++] = secilenSayi;
                System.out.println("Kalan hakkınız: " + (hak - dogruTahmin));

            }
        }

        if (!kazandi) {
            System.out.println("Kaybettiniz!");
            if (!hataliGiris) {
                System.out.println("Tahminleriniz: " + Arrays.toString(yanlislar));
                System.out.println(" gizli sayı : "+sayi);

            }
        }
        input.close();
    }
}
