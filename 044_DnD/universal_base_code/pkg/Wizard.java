package pkg;
import java.util.Scanner;
import java.util.Random;


public class Wizard {
	String name;
	int health;
	int attack;
	
	
    public Wizard() {
        Random random = new Random();
        this.name = "Johnny";
        this.health = random.nextInt(10) + 1;
        this.attack = random.nextInt(14) + 1;
}

    public Wizard(String name) {
        Random random = new Random();
        this.name = name;
        this.health = random.nextInt(10) + 1;
        this.attack = random.nextInt(14) + 1;
    }
    
    public void setHealth(int x) {
        this.health = x;
    }

    public int getHealth() {
        return this.health;
    }

    public String getName() {
        return this.name;
    }
    public void attack(Warrior warrior) {
        Random rand4 = new Random();
        int z = rand4.nextInt(this.attack) + 1;
        warrior.setHealth(warrior.getHealth() - z);
    }
}
