import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		
		int bet = 100;
		int slot1 = 0;
		int slot2 = 0;
		int slot3 = 0;
		int num1;
		
		while(true) {
		
		//System.out.println("Do you want to play? (Yes, yes, Y, y)");
		String start = sc.nextLine();
		if(start.equals("Yes") || start.equals("yes") || start.equals("Y") || start.equals("y")) {
			System.out.println("Enter a bet (You have " + bet + " dollars left)");
			num1 = sc.nextInt();
				while(num1 > bet || num1 <= 0) {
					if(num1 <= 0) {
				System.out.println("No negatives or 0");
				System.out.println("Please enter a smaller number: ");
					}
				 else {
				System.out.println("You only have $" + bet + "Please enter a smaller number: ");
				 }
			}
			
			
		
		
		
		Random slot = new Random();
		slot1 = slot.nextInt(10)+1;
		slot2 = slot.nextInt(10)+1;
		slot3 = slot.nextInt(10)+1;

		System.out.println(" ");
		System.out.println("Your lucky numbers are: ");
		System.out.println(" ");
		System.out.println(" | "+slot1+" |"+" | "+slot2+" | "+slot3+" | ");
		
	
		
		if (slot1 == slot2 && slot2 == slot3) {
                    System.out.println("You're bet has  been tripled!");
                    System.out.println("You now have $" + (bet += num1 * 2));
		}
		else if(slot1 == slot2 || slot1 == slot3 || slot2 == slot3) {
			System.out.println("Your bet has been doubled!");
			System.out.println("You know have $" + (bet += num1));
		}
		else {
			System.out.println("You lost your bet!");
			System.out.println("You now have $" + (bet -= num1));
		}
		
		
		if(bet == 0) {
			System.out.println("You have lost all your money! Go get some more, we'll be waiting ;)");
			
		}
		
		if(start.equals("No") || start.equals("no") || start.equals("N") || start.equals("n") ) {
			System.out.println("See you later, Bye!");
			
		}
	}
		}
	}
}
