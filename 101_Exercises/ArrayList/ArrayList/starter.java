import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("How mnay values do you want in your array");
		int array = sc.nextInt();
		array.printArrayList();
		array.addValuesArrayList();
		
	}
}
