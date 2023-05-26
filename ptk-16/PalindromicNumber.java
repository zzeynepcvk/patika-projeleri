import java.util.Scanner;

public class PalindromicNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = scanner.nextInt();
        
        if (isPalindromic(number)) {
            System.out.println(number + " bir palindrom sayıdır.");
        } else {
            System.out.println(number + " bir palindrom sayı değildir.");
        }
        scanner.close();
    }
    
    public static boolean isPalindromic(int number) {
        int originalNumber = number;
        int reversedNumber = 0;
        
        while (number > 0) {
            int lastDigit = number % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            number = number / 10;
        }
        
        return originalNumber == reversedNumber;
    }
}
