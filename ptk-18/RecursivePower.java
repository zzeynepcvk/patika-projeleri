import java.util.Scanner;

public class RecursivePower {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Taban değeri giriniz: ");
            int base = scan.nextInt();
            System.out.print("Üs değerini giriniz: ");
            int exponent = scan.nextInt();

            int result = power(base, exponent);
            System.out.println("Sonuç: " + result);

            System.out.print("Başka bir üs alma işlemi yapmak istiyor musunuz? (E/H): ");
            String choice = scan.next();

            if (choice.equalsIgnoreCase("H"))
                break;
        }

        scan.close();
    }

    static int power(int base, int exponent) {
        if (exponent == 0)
            return 1;

        return base * power(base, exponent - 1);
    }
}
