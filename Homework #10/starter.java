import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
	int x;
	int y;
	
	int []joe = new int[21];
	
	int a = 19;
	Random rand = new Random();
	System.out.println("Here are 20 random numbers");
	for(y = 0; y < 20; ++y) {
		joe[y] = rand.nextInt(10) + 1;
		System.out.println(joe[y]);
		
	}
	y = rand.nextInt(10) +1;
	System.out.println("The lucky number is");
	int b = 0;
	for(x = 0; x < 20; ++x) {
		if(y != joe[x]) {
			++b;
		}
		System.out.println("The duplicate number is " + x);
		
	}
	System.out.println("The total times " + y + " shows up is " + b);
	
	x = joe[0];
	int q;
	for(q = 1; q < 20; ++q) {
		if(x == joe[q]) {
			System.out.println("The same number has been found at " + (q - 1) + " and " + q);
			System.out.println("The number is " + joe[q]);
		}
	}
	x = joe[q];
}
}
