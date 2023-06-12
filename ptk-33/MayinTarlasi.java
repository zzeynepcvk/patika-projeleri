import java.util.Random;

public class MayinTarlasi {
    private int satirSayisi;
    private int sutunSayisi;
    private int[][] tarla;
    private boolean[][] mayinlar;

    public MayinTarlasi(int satirSayisi, int sutunSayisi) {
        this.satirSayisi = satirSayisi;
        this.sutunSayisi = sutunSayisi;
        this.tarla = new int[satirSayisi][sutunSayisi];
        this.mayinlar = new boolean[satirSayisi][sutunSayisi];
        mayinlariYerlestir();
    }

    private void mayinlariYerlestir() {
        int mayinSayisi = satirSayisi * sutunSayisi / 4;
        Random rand = new Random();

        while (mayinSayisi > 0) {
            int satir = rand.nextInt(satirSayisi);
            int sutun = rand.nextInt(sutunSayisi);

            if (!mayinlar[satir][sutun]) {
                mayinlar[satir][sutun] = true;
                mayinSayisi--;
            }
        }
    }

    public boolean oyunuKontrolEt(int satir, int sutun) {
        if (mayinlar[satir][sutun]) {
            return false;
        }

        int mayinSayisi = 0;

        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (satir + i >= 0 && satir + i < satirSayisi && sutun + j >= 0 && sutun + j < sutunSayisi) {
                    if (mayinlar[satir + i][sutun + j]) {
                        mayinSayisi++;
                    }
                }
            }
        }

        tarla[satir][sutun] = mayinSayisi;
        return true;
    }

    public void tarlayiGoster() {
        for (int i = 0; i < satirSayisi; i++) {
            for (int j = 0; j < sutunSayisi; j++) {
                if (tarla[i][j] != 0) {
                    System.out.print(tarla[i][j] + " ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }
}
