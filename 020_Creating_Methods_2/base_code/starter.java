import java.util.Scanner;
import java.util.Random;

class starter {
	
	public static int power(int x, int y) {
		int a = 0;
		int z = x;
		while(a < y - 1) {
			z *= x;
			++a;
		}
		return z;
	}
	
	
	
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
	System.out.println("Gimmie a base number");
	int base = sc.nextInt();
	System.out.println("Gimme an exponent number");
	
	System.out.println(power(base, sc.nextInt()));


		
	}
}
