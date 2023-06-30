public class Bear extends Obstacle {
    public Bear() {
        super("Bear", 6, 4);
    }

    @Override
    public String getDescription() {
        return "A ferocious bear!";
    }
}
