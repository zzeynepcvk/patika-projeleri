public class Forest extends BattleLoc {
    public Forest() {
        super("Forest", "You are in a dark and creepy forest. Be careful!");
    }

    @Override
    public void onEnter(Player player) {
        System.out.println("You entered the forest. Watch out for enemies!");
        // Implement additional actions as needed
    }

    @Override
    public boolean onBattle(Player player) {
        // Implement battle logic with enemies in the forest
        // Return true if the player wins the battle, otherwise false
        return false;
    }
}
