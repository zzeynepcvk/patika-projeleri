public class Zombie extends Obstacle {
    public Zombie() {
        super("Zombie", 4, 2);
    }

    @Override
    public String getDescription() {
        return "A decaying zombie!";
    }
}
