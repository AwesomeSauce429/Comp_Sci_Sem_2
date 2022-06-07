package pkg;
import java.util.Scanner;
import java.util.Random;


public class Zombie implements Creature {
	String name;
	int health;
	int attack;
	Random rand = new Random();
	Random rand1 = new Random();

	
	public Zombie() {
		name = "Zach";
		health = rand.nextInt(6) + 5;
		attack = rand1.nextInt(6) + 5;
		
	}
	public boolean takeDamage(int x) {
		if(health - attack == 0){
			Zombie.isDead() = true;
			System.out.println("Zach is dead");
			
		}
		else {
			Zombie.isDead() = false;
			System.out.println("Zach is alive");
		}
	}

}

