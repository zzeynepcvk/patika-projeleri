public class AsalSayilar {
    public static void main(String[] args) {
        System.out.println("1 - 100 arasindaki asal sayilar:");

        for (int i = 2; i <= 100; i++) {
            if (asalMi(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean asalMi(int sayi) {
        if (sayi < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(sayi); i++) {
            if (sayi % i == 0) {
                return false;
            }
        }

        return true;
    }
}
