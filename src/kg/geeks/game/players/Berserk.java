package kg.geeks.game.players;

public class Berserk extends Hero {
    private int blockedDamage;
    public Berserk(int health, int damage, String name) {
        super(health, damage, SuperAbility.BLOCK_DAMAGE_AND_REVERT, name);
    }

    public void setBlockedDamage(int blockedDamage) {
        this.blockedDamage = blockedDamage;
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        if (boss.getHealth() > 0 ) {
            boss.setHealth(boss.getHealth() - boss.getDamage() );
        }


    }
}
