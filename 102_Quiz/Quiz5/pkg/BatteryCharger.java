package pkg;
import java.util.Scanner;
import java.util.Random;

	

public class BatteryCharger {
	
	public BatteryCharger() {
	
	
	private int getChargingCost(int startHour, int chargeTime) {
		
		int sum = 0;
		
		
		for (int i = startHour; i < startHour + chargeTime; i++)
			sum += rateTable[i % 24];
			
		return sum;
	}
	
	public int getChargeStartTime(int chargeTime) {
		
		
		int bestTime = 0;
		int bestCost = getChargingCost(0, chargeTime);
		
		
		for (int i = 1; i < 24; i++) {
			
			int newCost = getChargingCost(i, chargeTime);
			
			
			if (newCost < bestCost) {
				bestCost = newCost;
				bestTime = i;
			}
		}
		
		return bestTime;
	}
	

}

}




