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

		
	}
}
