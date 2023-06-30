public abstract class BattleLoc extends Location {
    public BattleLoc(String name, String description) {
        super(name, description);
    }

    public abstract boolean onBattle(Player player);
}
