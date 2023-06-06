public class HarmonikOrtalama {
    public static void main(String[] args) {
        double[] numbers = {1, 2, 3, 4, 5};
        double sum = 0;
        
        // Elemanların harmonik serisini hesapla
        for (double number : numbers) {
            sum += 1 / number;
        }
        
        // Harmonik ortalamayı hesapla
        double harmonicMean = numbers.length / sum;
        
        System.out.println("Harmonik Ortalama: " + harmonicMean);
    }
}
