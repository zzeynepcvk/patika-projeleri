public class River extends BattleLoc {
    public River() {
        super("River", "You are near a wild river. Be cautious!");
    }

    @Override
    public void onEnter(Player player) {
        System.out.println("You approached the river. Danger may be lurking.");
        // Implement additional actions as needed
    }

    @Override
    public boolean onBattle(Player player) {
        // Implement battle logic with enemies near the river
        // Return true if the player wins the battle, otherwise false
        return false;
    }
}
