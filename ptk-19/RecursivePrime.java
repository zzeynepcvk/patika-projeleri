import java.util.Scanner;

public class RecursivePrime {
    static boolean isPrime(int number, int divisor) {
        if (number < 2) {
            return false;
        }
        if (divisor == 1) {
            return true;
        }
        if (number % divisor == 0) {
            return false;
        }
        return isPrime(number, divisor - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayıyı giriniz: ");
        int number = scan.nextInt();

        boolean isNumberPrime = isPrime(number, number / 2);

        if (isNumberPrime) {
            System.out.println(number + " bir asal sayıdır.");
        } else {
            System.out.println(number + " bir asal sayı değildir.");
        }
        scan.close();
    }
}
