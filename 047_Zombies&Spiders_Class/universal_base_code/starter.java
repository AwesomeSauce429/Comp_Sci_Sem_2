import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Spider spidey = new Spider();
		Zombie bob = new Zombie();
		Fighter fighter = new Fighter();
		fighter.attack(spidey);
		fighter.attack(bob);
		spidey.takeDamage(fighter.attack);
		bob.takeDamage(fighter.attack);
		
		

		
	}
}
