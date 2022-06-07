package pkg;
import java.util.Scanner;
import java.util.Random;


public class Combinatorics {
	
public static int factorial(int n) {
    
    
	if(n==1) {
	    return n;
}
    if(n>= 1 || n < 13) {
        int c = 1;
    while(n > 0) {
        c = c * n;
        n--;
    }
    return n;

    
}
return -1;

}
public static void numCombinations(int n, int r) {
    if(r>n) {
        System.out.println("There are 0 ways of choosing " + r + " from " + n + " choices ");
        return;
    }
    else {
        int num = factorial(n)/factorial(r)*factorial(n-r);
        System.out.println("There are " + num + " ways of choosing " + r + "from "+ n + " items choices");
    }
}




}

