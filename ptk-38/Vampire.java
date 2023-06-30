public class Vampire extends Obstacle {
    public Vampire() {
        super("Vampire", 5, 3);
    }

    @Override
    public String getDescription() {
        return "A bloodthirsty vampire!";
    }
}
