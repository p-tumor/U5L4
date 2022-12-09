public class Dragon {
    private int health;
    private int strength;
    private int level;
    private int damageAccumulated;
    private boolean dead;

    public Dragon() {
        this.health = 100;
        this.strength = 1;
        this.level = 1;
        damageAccumulated = 0;
        dead = false;
    }

    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

    public int getLevel() {
        return level;
    }

    public int getDamageAccumulated() {
        return damageAccumulated;
    }

    public boolean isDead() {
        return dead;
    }

    public void takeDamage(int damage){
        health -= damage;
        if (health == 0) System.out.println("The dragon is already dead!");
        if (health <= 0){
            System.out.println("The dragon has been slayed!");
            health = 0;
            dead = true;
        }else System.out.printf("The dragon takes %s damage and now has %s health\n",damage, health);
    }

    public int attack(){
        System.out.printf("The dragon attacks for %d health points!\n", level*strength);
        damageAccumulated += level*strength;
        if (damageAccumulated >= 50){
            level++;
            System.out.printf("The Dragon is now level %d.\n",level);
            damageAccumulated = 0;
        }
        return level*strength;
    }

    public void powerUp(int choice){
        if (choice == 1){
            health *= 2;
            System.out.printf("The dragon's health has increased to %d",health);
        }
        if (choice == 2){
            strength*=2;
            System.out.printf("The dragon's strength has increased to %d",strength);
        }
    }

    public String toString(){
        return "Is the dragon dead"+dead+".\n"+
                "Dragon's current health: "+health+".\n" +
                "Dragon's current Level: "+level+".\n" +
                "Dragon's current Strength: "+strength+".\n" +
                "Dragon's Accumulated damage: "+damageAccumulated+".\n";
    }
}
