//package pkg;
import pkg.*;
import java.util.Scanner;
import java.util.Random;


public class Warrior implements Role {
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
    
    public void setHealth(int x);
    public int getHealth();
    public String getName();
    
    
    public void attack(Role wizard) {
        Random rand3 = new Random();
        int y = rand3.nextInt(this.attack) + 1;
        wizard.setHealth(wizard.getHealth() - y);
    }
   
}

