public class Main {
    public static void main(String[] args) {
        // Oyuncu oluşturma
        Player player = new Player("Samuray", 1, 5, 21, 15);

        // Karakter oluşturma
        Karakter karakter1 = new Karakter(1, 5, 21, 15);
        Karakter karakter2 = new Karakter(2, 7, 18, 20);
        Karakter karakter3 = new Karakter(3, 8, 24, 5);

        // Canavar oluşturma
        Canavar canavar1 = new Canavar(1, 3, 10, 4);
        Canavar canavar2 = new Canavar(2, 4, 14, 7);
        Canavar canavar3 = new Canavar(3, 7, 20, 12);

        // Silah oluşturma
        Silah silah1 = new Silah(1, 2, 25);
        Silah silah2 = new Silah(2, 3, 35);
        Silah silah3 = new Silah(3, 7, 45);

        // Zırh oluşturma
        Zırh zırh1 = new Zırh(1, 1, 15);
        Zırh zırh2 = new Zırh(2, 3, 25);
        Zırh zırh3 = new Zırh(3, 5, 40);

        // Mekan oluşturma
        Location safeHouse = new SafeHouse();
        Location toolStore = new ToolStore();
        Location forest = new Forest();
        Location cave = new Cave();
        Location river = new River();

        // Mekanlara oyuncu girişini sağlama
        safeHouse.onEnter(player);
        toolStore.onEnter(player);
        forest.onEnter(player);
        cave.onEnter(player);
        river.onEnter(player);
    }
}
