import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Satır sayısını girin: ");
        int satirSayisi = scanner.nextInt();

        System.out.print("Sütun sayısını girin: ");
        int sutunSayisi = scanner.nextInt();

        MayinTarlasi mayinTarlasi = new MayinTarlasi(satirSayisi, sutunSayisi);

        System.out.println("Mayın Tarlası Oyuna Hoşgeldiniz!");
        boolean devam = true;

        while (devam) {
            System.out.println("Tarlayı görmek için 'g', nokta seçmek için 's' girin: ");
            char secim = scanner.next().charAt(0);

            switch (secim) {
                case 'g':
                    mayinTarlasi.tarlayiGoster();
                    break;
                case 's':
                    System.out.print("Satırı girin: ");
                    int satir = scanner.nextInt();

                    System.out.print("Sütunu girin: ");
                    int sutun = scanner.nextInt();

                    if (satir < 0 || satir >= satirSayisi || sutun < 0 || sutun >= sutunSayisi) {
                        System.out.println("Geçersiz nokta! Tekrar deneyin.");
                        continue;
                    }

                    if (!mayinTarlasi.oyunuKontrolEt(satir, sutun)) {
                        System.out.println("Game Over!!");
                        devam = false;
                    } else {
                        boolean kazandiMi = true;

                        for (int i = 0; i < satirSayisi; i++) {
                            for (int j = 0; j < sutunSayisi; j++) {
                                if (!mayinTarlasi.oyunuKontrolEt(i, j)) {
                                    kazandiMi = false;
                                    break;
                                }
                            }
                        }

                        if (kazandiMi) {
                            System.out.println("Oyunu Kazandınız!");
                            devam = false;
                        }
                    }
                    break;
                default:
                    System.out.println("Geçersiz seçim! Tekrar deneyin.");
                    break;
            }
        }

        scanner.close();
    }
}
