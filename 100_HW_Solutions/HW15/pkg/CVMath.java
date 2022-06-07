package pkg;
import java.util.ArrayList;

public class CVMath {
	public static int findMid(int one, int two, int three)
	{
		return (one + two + three - Math.min(one,Math.min(two,three)) - Math.max(one,Math.max(two,three)));
	}
	public static int[] specialSquare(int num) {
		 int[] x= new int[num];
		int sum = 0;
		int y = 0;
		int z = 2;
		for(int i = 0; i < x.length; z++) {
		sum = 0;
		y = z * z;
		
		for(int i2 = 1; sum<y; i2++) {
			sum = sum +i2;
		}
		
		if(sum == y) {
			x[i] = y;
			i++;
		}
		
		}
		return x;
	}

}
