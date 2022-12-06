package u4pp;


public class RandomMonster extends Monster{
    
    public RandomMonster(String name, int health, int attack, int exp){
        super(name, health, attack, exp);
    }
    //random chance to damage player
    public void takeTurn(Combatant target){
        double i = Math.random();
        if (i > .5){
            target.takeDamage(attackPower);
        } 

    }

    public String toString(){
        String str = getName() + " " + getAttackPower() + " " + getExpGiven() + " " + getHealth() + " " + getMaxHealth() + "50% HIT OR MISS I GUESS THEY NEVER MISS HUH";
        return str;
    }
}
