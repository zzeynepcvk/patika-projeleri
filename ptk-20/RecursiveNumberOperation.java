public class RecursiveNumberOperation {
    static void numberOperation(int n) {
        if (n <= 0) {
            System.out.print(n + " ");
            return;
        }
        
        System.out.print(n + " ");
        numberOperation(n - 5);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        int n = 16;
        numberOperation(n);
    }
}
