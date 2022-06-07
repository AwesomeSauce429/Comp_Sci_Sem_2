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
	    
	   System.out.println("Please input your third number: ");
	  
	   int third = sc.nextInt();
	   
	  boolean largest;
	  largest = (first > second && first > third);
	  
	  
	  boolean largest1;
	  largest1 = (second > first && second > third);
	  
	  boolean largest2;
	  largest2 = (third > first && third > second);
	  
	  if(largest)
	  {
	  	System.out.println("The first number was the largest number and it is " + first);
	  }
	  if(largest1)
	  {
	  	System.out.println("The second number was the largest number and it is " + second);
	  }
	  if(largest2)
	  {
	  	System.out.println("The third number was the largest number and it is " + third);
	  }
	  
	  
	  boolean smallest;
	  smallest = (first < second && first < third);
	  
	  
	  boolean smallest1;
	  smallest1 = (second < first && second < third);
	  
	  boolean smallest2;
	  smallest2 = (third < first && third < second);
	  
	  if(smallest)
	  {
	  	System.out.println("The first number was the smallest number and it is " + first);
	  }
	  if(smallest1)
	  {
	  	System.out.println("The second number was the smallest number and it is " + second);
	  }
	  if(smallest2)
	  {
	  	System.out.println("The third number was the smallest number and it is " + third);
	  }
	  
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}
}
