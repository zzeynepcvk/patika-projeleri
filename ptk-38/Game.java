public class Game {
    private Player player;

    public Game(String playerName) {
        player = new Player(playerName, new SafeHouse());
    }

    public void start() {
        System.out.println("Welcome to the game! Let the adventure begin!");
        // Implement game logic and interaction with the player
    }

    // Implement additional game functionality as needed
}
