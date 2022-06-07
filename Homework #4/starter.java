import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer");
		int num1 = sc.nextInt();
		System.out.println("Enter one more integer");
		int num2 = sc.nextInt();
		
		if(num1%2 == 0) {
			System.out.println("The first number is even\n");
		}
		else {
			System.out.println("The first number ain't even homie\n");
		}
		if(num2%2==0) {
			System.out.println("The second number is very even mah g\n");
			
		}
		else {
			System.out.println("The second number is very odd g\n");
		}
		
		
		if(num1%3==0) {
			System.out.println("The first number is very divisible by 3 mah g\n");
			
		}
		else {
			System.out.println("The first number is not very divisible by 3 odd g\n");
		}
		
		if(num2%3==0) {
			System.out.println("The second number is very divisible by 3 mah g\n");
			
		}
		else {
			System.out.println("The second number is not very divisible by 3 odd g\n");
		}
		if(num1%4==0) {
			System.out.println("The first number is very divisible by 4 mah g\n");
			
		}
		else {
			System.out.println("The first number is not very divisible by 4 odd g\n");
		}
		if(num2%4==0) {
			System.out.println("The second number is very divisible by 4 mah g\n");
			
		}
		else {
			System.out.println("The second number is not very divisible by 4 odd g\n");
		}
		if(num1%5==0) {
			System.out.println("The first number is very divisible by 5 mah g\n");
			
		}
		else {
			System.out.println("The first number is not very divisible by 5 odd g\n");
		}
		if(num2%5==0) {
			System.out.println("The second number is very divisible by 5 mah g");
			
		}
		else {
			System.out.println("The second number is not very divisible by 5 odd g\n");
		}
	}
}
