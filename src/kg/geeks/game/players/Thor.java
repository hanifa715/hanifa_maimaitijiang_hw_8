package kg.geeks.game.players;

import kg.geeks.game.logic.RPG_Game;

public class Thor extends Hero{
    public static boolean Thor = false;
    public Thor(int health, int damage, String name) {
        super(health, damage, SuperAbility.STUN, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        Thor = RPG_Game.random.nextBoolean();
        if (Thor) {
            boss.setDamage(0);
            System.out.println("Босс оглушен!!!");
        }else {
            boss.setDamage(150);
        }
    }
}
