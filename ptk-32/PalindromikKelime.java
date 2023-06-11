import java.util.Scanner;

public class PalindromikKelime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir kelime girin: ");
        String kelime = input.nextLine();

        if (isPalindrom(kelime)) {
            System.out.println(kelime + " kelimesi palindromiktir.");
        } else {
            System.out.println(kelime + " kelimesi palindromik değildir.");
        }
        input.close();
    }

    public static boolean isPalindrom(String kelime) {
        int baslangic = 0;
        int son = kelime.length() - 1;

        while (son > baslangic) {
            if (kelime.charAt(baslangic) != kelime.charAt(son)) {
                return false;
            }
            baslangic++;
            son--;
        }
        return true;
    }
}
