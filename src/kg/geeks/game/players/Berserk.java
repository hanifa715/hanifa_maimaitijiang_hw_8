package kg.geeks.game.players;

public class Berserk extends Hero {
    private int blockedDamage;
    public Berserk(int health, int damage, String name) {
        super(health, damage, SuperAbility.BLOCK_DAMAGE_AND_REVERT, name);
    }

    public int getBlockedDamage() {
        return blockedDamage;
    }

    public void setBlockedDamage(int blockedDamage) {
        this.blockedDamage = blockedDamage;
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        setBlockedDamage(boss.getDamage()/10);
        for (int i = 0; i < heroes.length; i++) {
            if (this.getHealth() > 0 && boss.getHealth() > 0) {
                boss.setHealth(boss.getHealth() - (this.getDamage() + getBlockedDamage()));
                break;
            }

        }
        System.out.println(this.getName() + " " + "отбил босса");


    }
}
