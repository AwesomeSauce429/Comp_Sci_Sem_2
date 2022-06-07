import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);

	System.out.println("Please enter a name: ");
	String name = sc.nextLine();
	
	System.out.println("Please enter how many times you want the name to be displayed: ");
	int number =  sc.nextInt();
	
	int x = 1;
	
	while(true) {
		System.out.println(name);
		if(x == number) {
			break;
		}
		++x;
	}

		
	}
}
