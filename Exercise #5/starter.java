import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		while(true)
		{
		
		System.out.println(	num = num - 1);
		if(num == 5)
		{
		break;	
		}
		}
		System.out.println("Enter a number");
		int x = sc.nextInt();
		int ans = x -1;
		while(true)
		{
		
		System.out.println(x);
		x = x * ans;
		if(ans == 0)
		{
		break;	
		}
		ans = ans - 1;
		}
		
}
}
