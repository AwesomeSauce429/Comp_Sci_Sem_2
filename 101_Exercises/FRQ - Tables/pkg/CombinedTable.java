package pkg;
import java.util.Scanner;
import java.util.Random;


public class CombinedTable {

	public int numCombinedSeats() {
		int seats;
		int seat;
		seats = seat - 2;
		if(seats < seat) {
			System.out.println("The max amount of people you can have at the table is " + seats);
		}
		return seats;
	}
	public int numTableHeight() {
		int height1;
		int height2;
		int des;
		int des1;
		if(height1 == height2) {
			des = (height1 + height2)/2;
			System.out.println("The desirablity is " + des + " since the tables are the same height");
			return des;
		}
		else{
			des1 = ((height1 - height2)/2) - 10;
			return des1;
		}
	
		
	}

	

}

