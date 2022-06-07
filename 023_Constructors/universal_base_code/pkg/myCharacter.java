package pkg;



public class myCharacter {
	public String role;
	public int s;
	public int d;
	public int i;
	public int c;
	public int ch;
	

	public myCharacter() {
		role = new String("no role");
		s = 5;
		d = 5;
		i = 2;
		c = 3;
		ch = 5;
		
	}
	public myCharacter(String role) {
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
		s = 5;
		d = 5;
		i = 2;
		c = 3;
		ch = 5;
		
	}
}

