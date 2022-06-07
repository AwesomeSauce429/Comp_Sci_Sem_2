import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("Please input your first number: ");
	   
	   int first = sc.nextInt();
	  
	  
	  System.out.println("Please input your second number: ");
	  
	  int second = sc.nextInt();
	  
	  boolean different;
	  different = (first != second);
	  
	  boolean same;
	  same = (first == second);
	  
	  if(different)
	  {
	  	System.out.println("Your numbers are different!");
	  }

	  if(same)
	  {
	  	System.out.println("Your numbers are the same!");
	  }
	}
}
