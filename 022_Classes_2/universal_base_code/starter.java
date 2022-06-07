import pkg.myCharacter;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		myCharacter character = new myCharacter();
		System.out.println("Your role is: " + character.role);
		System.out.println("Your strength is: " + character.s);
		System.out.println("Your dexterity is: " + character.d);
		System.out.println("You Intelligence is: " + character.i);
		System.out.println("Your Constitution is: " + character.c);
		System.out.println("Your Charisma is: " + character.ch);


		
	}
}
