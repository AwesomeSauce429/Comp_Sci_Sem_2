import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int rand1 = rand.nextInt(1000);
		
		while (true) {
		System.out.println("Guess a number (0-1000): ");
		int guess = sc.nextInt();
		
		if(guess == rand1) {
			break;
		}
		if(guess > rand1) {
			System.out.println("Your guess is to high!");
			
		}
		else {
			System.out.println("Your guess is to low!");
		}
		}

		System.out.println("You guess it!");
	
	
	
	}
}
