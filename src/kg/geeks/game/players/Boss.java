package kg.geeks.game.players;

import kg.geeks.game.logic.RPG_Game;

public class Boss extends GameEntity{
    private SuperAbility defence;

    public Boss(int health, int damage, String name) {
        super(health, damage, name);
    }

    public SuperAbility getDefence() {
        return defence;
    }

    public void chooseDefence(Hero[] heroes) {
        int randomIndex = RPG_Game.random.nextInt(heroes.length);
        this.defence = heroes[randomIndex].getAbility();
    }

    public void hit(Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if(heroes[i].getHealth() > 0) {
                heroes[i].setHealth(heroes[i].getHealth() - this.getDamage());
            }
        }
    }
    public String toString() {
        return "BOSS " + super.toString() + " DEFENCE: " + this.defence;
    }
}


