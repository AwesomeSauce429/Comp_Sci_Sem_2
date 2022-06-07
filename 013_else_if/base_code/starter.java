import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
			Scanner sc = new Scanner(System.in);
		
		Random rand = new Random();
		int rand_num1 = rand.nextInt(1000);
		
		System.out.println("Please enter a number 1-1000: ");
		
		int guess = sc.nextInt();
		
		if(guess == rand_num1)
		{
			System.out.println("Correct");
		}
		 else if(guess > rand_num1)
		 {
		 	System.out.println("The number was " + rand_num1+"." + " Your number was bigger than the number.");
		 }
		 else if(guess < rand_num1)
		 {
		 	System.out.println("The number was " + rand_num1+"." + " Your number was smaller than the number.");
		 }
	}
	
}
