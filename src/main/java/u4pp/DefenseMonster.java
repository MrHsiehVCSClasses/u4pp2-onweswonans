package u4pp;

public class DefenseMonster extends Monster{
    private int defense;

    //constructor
    public DefenseMonster (String name, int health, int attack, int exp, int defense){
        super(name, health, attack, exp);
        this.defense = defense;
    }


    public int getDefense() {
        return defense;
    }
    //takes damage reletive to the defense it has ex: 2atck power -1 defense = 1 damage
    public void takeDamage(int damage){
        health = health - damage + defense;
    }
    //converts stats to a string. includes name
    public String toString(){
        String str = "";
        str = getName() + " " + getAttackPower() + " " + getDefense() + " " + getExpGiven() + " " + getHealth() + " " + getMaxHealth();
        return str;
    }
}
