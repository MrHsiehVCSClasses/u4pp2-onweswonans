package u4pp;

public class Fighter extends Combatant{
    private int focusStacks = 0;
    private int EXP = 0;
    private int level = 1;
    private boolean isBlocking;

    //constructor
    public Fighter (String Name, int maxHealth, int attackPower ){
        super(Name, maxHealth, attackPower);
        focusStacks = 0;
        EXP = 0;
        level = 1;
        isBlocking = false;
    }
    // takes the blocking ability of the player into account
    public void takeDamage(int damage){
        if (isBlocking == true){
            health = health - damage/2;
            isBlocking = false;
        } else {
            health = health - damage;
        }
    }
    // activates blockingmode
    public void block(){
        isBlocking = true;
    }
    // damage is done to the target relative to the focus stacks and attack power of player
    public void attack(Combatant target){
        int finalDamage = getAttackPower();
        if (focusStacks != 0){
            for (int i = 0; i < focusStacks; i++){
            finalDamage *= 2;
            }
            target.takeDamage(finalDamage);
            focusStacks = 0;
        } else{
        target.takeDamage(getAttackPower());
        }
    }
    // adds a focus stack
    public void focus(){
        focusStacks += 1;
    }
    //allows player to gain exp and level up (thx andrew :D)
    public void gainEXP(int exp){
        EXP += exp;
        while (EXP >= level){
            EXP -= level;
            level += 1;
            maxHealth += 5;
            health = maxHealth;
            attackPower += 1;
        }
    }
    //converts stats to a string. includes name
    public String toString(){
        String str = getName() + " " + getEXP() + " " + getFocusStacks() + " " + getLevel() + " " + getAttackPower() + " " + getMaxHealth() + " " + getHealth() + " " + getIsBlocking();
        return str;
    }

    public int getEXP() {
        return EXP;
    }

    public int getLevel() {
        return level;
    }

    public int getFocusStacks() {
        return focusStacks;
    }

    public boolean getIsBlocking() {
        return isBlocking;
    }




}
