package pkg;
import java.util.Scanner;
import java.util.Random;


public class Musician extends Performer {
	String instrument;
	
	public Musician() {
		this.instrument = "cello";
		
	}
	public Musician(String bob) {
		this.instrument = bob;
	}
	public String getInstrument() {
		return this.instrument;
	}
	public void playInstrument() {
		System.out.println("The " + this.instrument + " is played");
	}
}

