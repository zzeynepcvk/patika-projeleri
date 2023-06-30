public class Cave extends BattleLoc {
    public Cave() {
        super("Cave", "You are in a mysterious cave. It's dark and dangerous.");
    }

    @Override
    public void onEnter(Player player) {
        System.out.println("You entered the cave. Be prepared for a fight!");
        // Implement additional actions as needed
    }

    @Override
    public boolean onBattle(Player player) {
        // Implement battle logic with enemies in the cave
        // Return true if the player wins the battle, otherwise false
        return false;
    }
}
