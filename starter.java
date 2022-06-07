import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		int x;
		Random rand = new Random();
		int joe[] = new int [20];
		int joe1[] = new int[20];
		int y = 19;
		for(x = 0;x < 20; ++x) {
			joe[x] = rand.nextInt(50) +1;
			System.out.println(joe[x]);
			
		}
		x = 0;
		while( y > -1) {
			joe1[y] = joe[x];
			++x;
			--y;
		}
		for(y = 0; y < 20; ++y) {
			System.out.println(joe1[y]);
		}
		
}
}
