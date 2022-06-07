package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
	public String role;
	public int s;
	public int d;
	public int i;
	public int c;
	public int ch;
	

	public setRole(String role) {
		this.role = role;
		if(role.equals("Warrior")) {
			System.out.println("You've chosen the Warrior! For honor!");
		}
		else if(role.equals("Wizard")) {
			 System.out.println("You've chosen the Wizard! Excelsior!");
		}
		else if(role.equals("Rogue")) {
			System.out.println("You've chosen the Rogue! How cunning!");
		}
		
		
	}
	public int setStrength(int x) {
		Strength = x;
		return setStrength;
	}
	public int setDexterity(int y) {
		Dexterity = y;
		return setDexterity;
	}
	public int setIntelligence(int z) {
		Intelligence = z;
		return setIntelligence;
	}
	public int setConstitution(int a) {
		Constitution = a;
		return setConstitution;
	}
	public int setCharisma(int b) {
		Charisma = b;
		return setCharisma;
	}
	public boolean setAll(String rvalue, int svalue, int dvalue, int ivalue, int cvalue, int chvalue) {
		role = rvalue;
		Strength = svalue;
		Dexterity = dvalue;
		Intelligence = ivalue;
		Constitution = cvalue;
		Charisma = chvalue;
		
		
		
		return true;
	}
	public void mytoString() {
		System.out.println("Your role is " + role);
		System.out.println("Your strenth is " + s);
		System.out.println("Your dexterity is " + d);
		System.out.println("Your intelligence is " + i);
		System.out.println("Your constitution is " + c);
		System.out.println("Your charisma is " + ch);
}
}

