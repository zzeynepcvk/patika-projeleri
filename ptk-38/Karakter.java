public class Karakter {
    private int id;
    private int damage;
    private int health;
    private int money;

    public Karakter(int id, int damage, int health, int money) {
        this.id = id;
        this.damage = damage;
        this.health = health;
        this.money = money;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}