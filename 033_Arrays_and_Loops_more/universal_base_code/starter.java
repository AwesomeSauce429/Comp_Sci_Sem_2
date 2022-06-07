import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int x;
		Random rand = new Random();
		int []joe = new int[rand.nextInt(150) +1];
		for (x = 0; x < joe.length; ++x) {
            joe[x] = rand.nextInt(100) + 1;
        }
		int y = -100;
		int a = 10000;
		int b = 0;
		for(x = 0; x < joe.length; ++x) {
			if(joe[x] > y) {
				y = joe[x];
			}
			if(joe[x] < a ) {
				a = joe[x];
			}
			b += joe[x];
		}
		
		System.out.println("There are " + joe.length + " integers");
		System.out.println("The maximum is " + y);
		System.out.println("The minimum is " + a);
		System.out.println("The average is " + b / joe.length);
		
	}
}
