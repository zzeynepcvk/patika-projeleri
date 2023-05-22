import java.util.Scanner;

public class KuvvetleriYazdirma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int n = scanner.nextInt();

        System.out.println("4'ün kuvvetleri:");
        for (int i = 1; Math.pow(4, i) < n; i++) {
            System.out.println("4^" + i + " = " + (int) Math.pow(4, i));
        }

        System.out.println("5'in kuvvetleri:");
        for (int i = 1; Math.pow(5, i) < n; i++) {
            System.out.println("5^" + i + " = " + (int) Math.pow(5, i));
        }

        scanner.close();
    }
}