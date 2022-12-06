package u4pp;

public class Combatant {
    public String name;
    public int maxHealth;
    public int health;
    public int attackPower;
        //all classes stem from this class except for MonsterFighter.java
    public Combatant (String name, int maxHealth, int attack){
        this.name = name;
        this.maxHealth = maxHealth;
        health = maxHealth;
        attackPower = attack;
    }
    //reduces the amount of health that the target has by the attack power of the monster/fighter
    public void takeDamage (int damage){
        if (damage < 0){
            
        } else{
            setHealth( health - damage);
        }
    }
    //checks if health is below zero
    public boolean canFight(){
        if (health <= 0){
            return false;
        } else {
            return true;
        }
    }
    // gives all stats
    public String toString(){
        String stats = getName() + " " + getAttackPower() + " " + getMaxHealth() + " " + getHealth();
        return stats;
    }

    public int getMaxHealth() {
        return maxHealth;
    }
    public void setMaxHealth(int maxHealth) {
        if (maxHealth <= 0){
            this.maxHealth = 1;
        } else {
            this.maxHealth = maxHealth;
        }
        
        if (health > this.maxHealth){
            health = maxHealth;
        }
    }

    public void setAttackPower(int attackPower) {
        if (attackPower < 0){
            this.attackPower = 0;
        } else {
            this.attackPower = attackPower;
        }
    }

    public int getAttackPower() {
        return attackPower;
    }
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if(health < 0){
            this.health = 0;
        } else if ( health > maxHealth){
            this.health = maxHealth;
        } else {
            this.health = health;
        }
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
