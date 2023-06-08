public class YildizliBHarfi {
    public static void main(String[] args) {
        int n = 7; // Yıldızların boyutunu belirlemek için kullanacağımız değişken

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (col == 0 || (row == 0 || row == n/2 || row == n-1) && col < n-1
                        || col == n-1 && !(row == 0 || row == n/2 || row == n-1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
