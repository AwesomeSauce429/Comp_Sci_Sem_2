package pkg;
import java.util.Scanner;
import java.util.Random;


public class Spider implements Creature {
	String name;
	int health;
	int attack;
	Random rand = new Random();
	Random rand1 = new Random();

	
	public Spider() {
		name = "Charlotte";
		health = rand.nextInt(6) + 5;
		attack = rand1.nextInt(6) + 5;
		
	}
	public boolean takeDamage(int x) {
		if(health - attack == 0){
			isDead() = true;
			System.out.println("Charlotte is dead");
			
		}
		else {
			isDead = false;
			System.out.println("Charlotte is alive");
		}
	}

}

