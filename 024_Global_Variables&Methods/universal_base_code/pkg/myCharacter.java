package pkg;


public class myCharacter {
	public String role;
	public int s;
	public int d;
	public int i;
	public int c;
	public int ch;

	public myCharacter() {
		this.role = new String("No role");
		s = 5;
		d = 5;
		i = 2;
		c = 3;
		ch = 5;
	}
	
	
	public myCharacter(String r) {
		this.role = r;
		if(role.equals("Warrior")) {
			System.out.println("You've chosen the Warrior! For honor!");
		}
		else if(role.equals("Wizard")) {
			 System.out.println("You've chosen the Wizard! Excelsior!");
		}
		else if(role.equals("Rogue")) {
			System.out.println("You've chosen the Rogue! How cunning!");
		}
		s = 5;
		d = 5;
		i = 2;
		c = 3;
		ch = 5;
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

