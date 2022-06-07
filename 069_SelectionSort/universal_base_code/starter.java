import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		addValuesInt(arr1, 200);
		//printValuesInt(arr1);
		selectionSort(arr1);			
		//System.out.println();
		printValuesInt(arr1);
	}
	

	public static void addValuesInt(ArrayList<Integer> arr, int num){
		for(int i = 0; i < num; i++){
			arr.add(new Integer((int)(Math.random()*100)));
		}
	}
	public static void printValuesInt(ArrayList<Integer> arr){
		for(int i = 0; i < arr.size(); i++){
			System.out.print(arr.get(i) + ", ");
		}
	}

	public static void selectionSort(ArrayList<Integer> arr) {
        for (int y = 0; y < arr.size(); y++) {
            int x = y;
            for (int z = y + 1; z < arr.size(); z++) {
                if (arr.get(z) >= arr.get(x)) 
                x = z;
            }
            int x2 = arr.get(y);
            arr.set(y, arr.get(x));
            arr.set(x, x2);
        }
    }
}







