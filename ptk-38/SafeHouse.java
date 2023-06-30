public class SafeHouse extends NormalLoc {
    public SafeHouse() {
        super("Safe House", "You are in a safe house. You can rest and heal here.");
    }

    @Override
    public void onEnter(Player player) {
        System.out.println("Welcome to the Safe House. You are safe here.");
        // Implement additional actions as needed
    }
}
