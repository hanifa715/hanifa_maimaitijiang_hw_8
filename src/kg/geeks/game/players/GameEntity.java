package kg.geeks.game.players;

public abstract class GameEntity {
    private int health;
    private int damage;

    public GameEntity(int health, int damage, String name) {
        this.health = health;
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health > 0) {
            this.health = health;
        } else {
            this.health = 0;
        }
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
    public String toString() {
        return "Health: " + this.health + "Damage: " + this.damage;
    }
}