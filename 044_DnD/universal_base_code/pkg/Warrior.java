package pkg;
import java.util.Scanner;
import java.util.Random;


public class Warrior {
	String name;
	int health;
	int attack;
	
	Random rand1 = new Random();
	Random rand2 = new Random();
	
    public Warrior() {
        name = "Bob";
        attack = rand1.nextInt(20) + 1;
	    health = rand2.nextInt(5) + 1;
    }
    public Warrior(String name) {
        this.name = name;
        attack = rand1.nextInt(20) + 1;
    	health = rand2.nextInt(5) + 1;
    }
    
    public void setHealth(int x) {
        health = x;
    }
    public int getHealth() {
        return this.health;
    }
    public String getName() {
        return this.name;
    }
    
    
    public void attack(Wizard wizard) {
        Random rand3 = new Random();
        int y = rand3.nextInt(this.attack) + 1;
        wizard.setHealth(wizard.getHealth() - y);
    }
   
}

