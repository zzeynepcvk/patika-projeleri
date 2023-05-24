import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci serisinin eleman sayısını giriniz: ");
        int elemanSayisi = input.nextInt();

        int sayi1 = 0, sayi2 = 1;

        System.out.print(elemanSayisi + " Elemanlı Fibonacci Serisi: " + sayi1 + " " + sayi2);

        for (int i = 2; i < elemanSayisi; i++) {
            int yeniSayi = sayi1 + sayi2;
            System.out.print(" " + yeniSayi);
            sayi1 = sayi2;
            sayi2 = yeniSayi;
        }

        input.close();
    }
}
