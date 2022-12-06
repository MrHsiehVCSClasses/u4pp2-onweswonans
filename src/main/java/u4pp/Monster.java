package u4pp;

public class Monster extends Combatant {
    private int expGiven;

    //constructor
    public Monster(String name, int health, int attack, int exp){
        super(name, health, attack);
        if (exp > 0){
            expGiven = exp;
        }   else {
            expGiven = 0;
        }
    }
    //gives player exp according to the amount given
    public int getExpGiven() {
        return expGiven;
    }
    // attacks player
    public void takeTurn(Combatant target){
        target.takeDamage(attackPower);

    }
    //gives all stats relevant to the monster
    public String toString(){
        String str = "";
        str = getAttackPower() + " " + getHealth() + " " + getMaxHealth() + " " + getExpGiven() + " " + getName();
        return str;
    }
}
