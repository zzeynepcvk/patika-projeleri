public class ToolStore extends NormalLoc {
    public ToolStore() {
        super("Tool Store", "You are in a tool store. You can buy/sell items here.");
    }

    @Override
    public void onEnter(Player player) {
        System.out.println("Welcome to the Tool Store. Feel free to browse the items.");
        // Implement additional actions as needed
    }
}
