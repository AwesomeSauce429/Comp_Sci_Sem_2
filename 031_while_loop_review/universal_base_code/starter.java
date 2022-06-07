import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Random rand = new Random();
		int [] x = new int[99];
		int y = 0;
		while(y < 100) {
			
			
			int r = rand.nextInt(100) + 1;
			x[y] = r;
			System.out.println(x[y]);
			y++;
		}


		
	}
}
