//import pkg.*;
import java.util.*;

class starter {
	  public static void printArr(ArrayList<Integer> arr) {
        for (int y = 0; y < arr.size(); y++) {
            System.out.print(arr.get(y) + ", ");
        }
        System.out.println();
        
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
	public static void selectionSortArr(ArrayList<Integer> arr) {
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
	  public static void insertionSortArr(ArrayList<Integer> arr) {
        for (int y = 1; y < arr.size(); y++) {
            int x;
            int x2 = arr.get(y);
            for (x = y - 1; x >= 0 && arr.get(x) > x2; x--) {
                arr.set(x + 1, arr.get(x));
            }
            arr.set(x + 1, x2);
        }
    }
	
	
	
	
	public static void main(String args[]) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        ArrayList<Integer> arr3 = new ArrayList<Integer>();
        for (int y = 0; y < 100; y++) {
            int x = (int)(Math.random() * 100.0);
            arr.add(x);
            arr2.add(x);
            arr3.add(x);
        }	
        
        System.out.print("Original: ");
        starter.printArr(arr);
        
        System.out.print("Bubble Sort Array: "); 
    	starter.bubbleSortArr(arr);
        starter.printArr(arr);
       
       System.out.print("Selection Sort: ");
       starter.selectionSortArr(arr2);
       starter.printArr(arr2);
       
       System.out.print("Insertion Sort: ");
       starter.insertionSortArr(arr3);
       starter.printArr(arr3);
        System.out.println("The median is: " + ((Integer)arr3.get(49) + (Integer)arr3.get(50)) / 2);
	}
}
