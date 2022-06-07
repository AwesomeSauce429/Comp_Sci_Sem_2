import java.util.Scanner;
import java.util.Random;


class starter {
	
		public static boolean checkPrime(int x) {
		 for (int a = 2; a < x; ++a){
			if(x % a == 0){
				return false;
			}
		}
		return true;
	}
	
	
	public static void printPrimes(int b) {
		for (int c = 2; c < b + 1; ++c) {
			if(checkPrime(c)) {
				System.out.println(c);
			}
		}
	}
	
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a number");
		int num = sc.nextInt();
		printPrimes(num);
	
}

}
