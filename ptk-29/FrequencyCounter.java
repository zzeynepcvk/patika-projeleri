public class FrequencyCounter {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};

        // Frekansları saklamak için bir dizi oluşturulur
        int[] frequencyArray = new int[arr.length];

        // Dizi üzerinde gezilerek her elemanın frekansı hesaplanır
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int frequency = 1;

            // Dizi boyunca gezilerek aynı elemanları sayar
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == num) {
                    frequency++;
                }
            }

            // Frekans diziye atanır
            frequencyArray[i] = frequency;
        }

        // Frekansları ekrana yazdırılır
        for (int i = 0; i < arr.length; i++) {
            int number = arr[i];
            int frequency = frequencyArray[i];
            System.out.println(number + " sayısı " + frequency + " kere tekrar edildi.");
        }
    }
}
