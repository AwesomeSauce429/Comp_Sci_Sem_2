import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Performer p = new Performer();
		Performer p2 = new Performer("Pitbull", 41);
		Musician m = new Musician();
		Musician m2 = new Musician("violin");
		System.out.println("The first Performer's name is " + p.getName());
		p.practice();
		System.out.println("the second Performer's name is " + p2.getName());
		p2.practice();
		System.out.println("The first musician's name is " + m.getName());
		m.perform();
		m.playInstrument();
		System.out.println("The second musician's instrument is " + m2.getInstrument());
		m2.practice();
		Musician m3 = new Musician("Eminem", "microphone");
		Musician m4 = new Musician("Dr Dre", 56, "keyboard");
		System.out.println("Musician 3's name is" + m3.getName());
		m3.practice();
		System.out.println("Musician 3's instrument is the" + m3.getInstrument());
		System.out.println("Musician 4's name is " + m4.getName());
		m4.perform();
		m4.playInstrument();

		
	}
}
