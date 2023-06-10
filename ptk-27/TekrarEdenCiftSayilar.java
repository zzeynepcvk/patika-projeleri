public class TekrarEdenCiftSayilar {
    public static void main(String[] args) {
        int[] dizi = {2, 5, 8, 2, 9, 6, 5, 8, 1, 6};
        
        // Tekrar eden çift sayıları bulmak için bir dizi kullanıyoruz
        int[] tekrarEdenCiftler = new int[dizi.length];
        int tekrarEdenCiftlerIndex = 0;
        
        // Diziyi tarayarak tekrar eden çiftleri buluyoruz
        for (int i = 0; i < dizi.length; i++) {
            for (int j = i + 1; j < dizi.length; j++) {
                if (dizi[i] == dizi[j] && dizi[i] % 2 == 0) {
                    tekrarEdenCiftler[tekrarEdenCiftlerIndex] = dizi[i];
                    tekrarEdenCiftlerIndex++;
                    break; // İkinci kez bulunmuş çift sayıyı bir kez eklemek için döngüden çıkıyoruz
                }
            }
        }
        
        // Bulunan tekrar eden çift sayıları ekrana yazdırıyoruz
        System.out.println("Tekrar Eden Çift Sayılar:");
        for (int k = 0; k < tekrarEdenCiftlerIndex; k++) {
            System.out.println(tekrarEdenCiftler[k]);
        }
    }
}
