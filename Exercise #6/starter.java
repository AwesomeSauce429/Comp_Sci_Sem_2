import java.util.Scanner;
import java.util.Random;


class starter {
	public static String Combine(int a, int b) {
	int x = a*b;
	if(x%3 == 0) {
		return "Your numbers are divisible by 3!";
	}
	
	else {
		return "Your number is not divisible by 3";
	}
	
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pick a number");
		int first = sc.nextInt();
		System.out.println("Pick one more number");
		int second = sc.nextInt();
		System.out.println(Combine(first, second));
		
}


}