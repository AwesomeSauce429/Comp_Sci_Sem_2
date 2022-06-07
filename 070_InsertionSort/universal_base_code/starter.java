import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		addValuesInt(arr1, 200);
		//printValuesInt(arr1);
		insertionSort(arr1);			
		//System.out.println();
		printValuesInt(arr1);
	}
	

	public static void addValuesInt(ArrayList<Integer> arr, int num){
		for(int i = 0; i < num; i++){
			arr.add(new Integer((int)(Math.random()*100)));
		}
	}
	public static void printValuesInt(ArrayList<Integer> arr){
		for(int i = 0; i < arr.size(); i++)
	}

	public static void insertionSort(ArrayList<Integer> arr) {
        for (int y = 1; y < arr.size(); y++) {
            int x;
            int x2 = arr.get(y);
            for (x = y - 1; x >= 0 && arr.get(x) > x2; x--) {
                arr.set(x + 1, arr.get(x));
            }
            arr.set(x + 1, x2);
        }
    }
}







