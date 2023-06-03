import java.util.Random;
public class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run() {
        if (checkWeight()) {
            Fighter firstFighter;
            Fighter secondFighter;

            // Rastgele bir sayı üretelim (0 veya 1)
            Random random = new Random();
            int randomNum = random.nextInt(2);

            // Rastgele sayıya göre ilk dövüşçüyü belirleyelim
            if (randomNum == 0) {
                firstFighter = f1;
                secondFighter = f2;
            } else {
                firstFighter = f2;
                secondFighter = f1;
            }

            while (firstFighter.health > 0 && secondFighter.health > 0) {
                System.out.println("======== YENİ ROUND ===========");
                secondFighter.health = firstFighter.hit(secondFighter);
                if (isWin()){
                    break;
                }
                firstFighter.health = secondFighter.hit(firstFighter);
                if (isWin()){
                    break;
                }
                printScore();
            }
        } else {
            System.out.println("Sporcuların ağırlıkları uyuşmuyor.");
        }
    }

    public boolean checkWeight() {
        return (f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight);
    }

    public boolean isWin() {
        if (f1.health == 0) {
            System.out.println("Maçı Kazanan : " + f2.name);
            return true;
        } else if (f2.health == 0){
            System.out.println("Maçı Kazanan : " + f1.name);
            return true;
        }
        return false;
    }

    public void printScore() {
        System.out.println("------------");
        System.out.println(f1.name + " Kalan Can \t:" + f1.health);
        System.out.println(f2.name + " Kalan Can \t:" + f2.health);
    }
}
