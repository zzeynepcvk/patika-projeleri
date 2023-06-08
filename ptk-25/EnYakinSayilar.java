import java.util.Scanner;

public class EnYakinSayilar {
    public static void main(String[] args) {
        int[] numbers = {15, 12, 788, 1, -1, -778, 2, 0};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Girilen sayıyı girin: ");
        int targetNumber = scanner.nextInt();

        int smallerNumber = Integer.MIN_VALUE;
        int largerNumber = Integer.MAX_VALUE;

        for (int number : numbers) {
            if (number < targetNumber && number > smallerNumber) {
                smallerNumber = number;
            }
            if (number > targetNumber && number < largerNumber) {
                largerNumber = number;
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı: " + smallerNumber);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + largerNumber);

        scanner.close();
    }
}
