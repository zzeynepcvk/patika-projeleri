public abstract class Obstacle {
    private String name;
    private int damage;
    private int defense;

    public Obstacle(String name, int damage, int defense) {
        this.name = name;
        this.damage = damage;
        this.defense = defense;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public int getDefense() {
        return defense;
    }

    public abstract String getDescription();
}
