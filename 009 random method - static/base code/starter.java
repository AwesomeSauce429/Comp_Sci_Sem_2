import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Random rand = new Random();
		int rand_num1 = rand.nextInt(9);
		System.out.println(rand_num1);
		
		
		Random rand1 = new Random();
		int randnum = rand.nextInt(100)+ 1;
		System.out.println(randnum);
		
		Random rand2 = new Random();
		double randnum2 = rand.nextDouble()+2.5;
		System.out.println(randnum2);
		
		
		Random rand3 = new Random();
		double randnum3 = 589*rand.nextDouble()+14;
		System.out.println(randnum3);
		
		
		
		
		

		

	}
}