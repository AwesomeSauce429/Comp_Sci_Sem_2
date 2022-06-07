import pkg.*;
import java.util.Scanner;
import java.util.Random;

public class starter {

	//Precondition: A and B are presorted in ascending order. 
	//Sort A and B into C.
	//public void int 3mergeSort(int [] A, int []B, int [] C){

	//}

	//A is the full array unsorted. 
	//First is the beginning index of the array A, last is the last index of the array.
	//Split A in two halves and sort independently. Then merge back into A.
	//public void int mergeSort(int [] A, int first, int last){

	//}
	
	public static void main(String args[]) {
	int arr[] = { 12, 11, 13, 5, 6, 7 };

		System.out.println("Given Array");
		printArray(arr);

		MergeSort ob = new MergeSort();
		ob.sort(arr, 0, arr.length - 1);

		System.out.println("\nSorted array");
		printArray(arr);
		
	}
}


