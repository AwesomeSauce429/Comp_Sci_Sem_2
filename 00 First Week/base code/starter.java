import java.util.Random;

class starter {

	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Random rand1 = new Random();
		double rand = rand1.nextInt(42)+12.5;
		double d = rand1.nextDouble();
		System.out.println(rand+ d);
		
	}
}
