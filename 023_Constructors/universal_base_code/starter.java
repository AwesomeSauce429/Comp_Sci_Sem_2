import pkg.myCharacter;
import java.util.Scanner;
import java.util.Random;


class starter {

	public static void main(String args[]) {
		// Your code goes below here
		myCharacter myChar2 = new myCharacter();
		System.out.println("Your role is " + myChar2.role);
        System.out.println("Your strength trait is " + myChar2.s);
        System.out.println("Your dexterity trait is " + myChar2.d);
        System.out.println("Your intelligence trait is " + myChar2.i);
        System.out.println("Your constitution trait is " + myChar2.c);
        System.out.println("Your charisma trait is " + myChar2.ch);
        System.out.println("                                                            ");

		Scanner sc = new Scanner(System.in);
		System.out.println("What class would you like to be?");
		String string = sc.nextLine();
		myCharacter myChar3 = new myCharacter(string);
		System.out.println("Your role is " + myChar3.role);
        System.out.println("Your strength trait is " + myChar3.s);
        System.out.println("Your dexterity trait is " + myChar3.d);
        System.out.println("Your intelligence trait is " + myChar3.i);
        System.out.println("Your constitution trait is " + myChar3.c);
        System.out.println("Your charisma trait is " + myChar3.ch);
        
        

		
	}
}
