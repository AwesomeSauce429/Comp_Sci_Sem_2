import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		addValuesInt(arr1, 200);
		//printValuesInt(arr1);
		bubbleSortArr(arr1);			
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

	public static void bubbleSortArr(ArrayList<Integer> arr) {
        for (int y = 0; y < arr.size() - 1; y++) {
            for (int z = 0; z < arr.size() - y - 1; z++) {
                if (arr.get(z) <= arr.get(z + 1)){
                int x = arr.get(z);
                arr.set(z, arr.get(z + 1));
                arr.set(z + 1, x);
                }
            }
        }
    }
}







