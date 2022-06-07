import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Performer []P = new Performer[] { new Performer("Performer"), new Musician("Musician", "Drums"), new Apprentice("Apprentice", 4, "Cow Bell", "Stanford", 6),new Actor("Actor", "Main")};
		
		Performer p = new Performer();
		Performer p2 = new Performer("Pitbull", 41);
		Musician m = new Musician();
		Musician m2 = new Musician("violin");
		Actor a = new Actor("Tom Cruise", "Actor");
		Apprentice aa = new Apprentice();
		Apprentice aa1 = new Apprentice("John Cena", 8);
		Apprentice aa2 = new Apprentice("Violin", "Pepe", 15);
		Apprentice aa3 = new Apprentice("George", 23, "Trumpet", "Yale", 4);
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
		a.practice();
		a.perform();
		a.monologue();
		aa.playInstrument();
		aa1.practice();
		aa2.perform();
		aa3.practiceAtUniversity();
		P[0].perform();
		P[0].practice();
		P[1].perform();
		P[1].practice();
		((Apprentice)P[2]).practiceAtUniversity();
		((Musician)P[2]).playInstrument();
		((Actor)P[3]).monologue();
		P[3].perform();

		
	}
}
