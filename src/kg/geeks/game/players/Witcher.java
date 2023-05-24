package kg.geeks.game.players;

import kg.geeks.game.logic.RPG_Game;

import static kg.geeks.game.players.SuperAbility.RESURRECTION;

public class Witcher extends Hero{
    public Witcher(int health, int damage, String name) {
        super(health, damage, SuperAbility.RESURRECTION, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (this.getHealth() > 0 && heroes[i].getHealth() == 0 && this !=heroes[i]) {
                heroes[i].setHealth(this.getHealth());
                this.setHealth(0);
                System.out.println(this.getName() + " оживил" + " " + heroes[i].getName());
                break;
            }
        }
    }
}
