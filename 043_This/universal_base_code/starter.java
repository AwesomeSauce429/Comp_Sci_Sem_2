import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
	int x;
	int y;
	Random rand = new Random();
	Dwarf[] dw = new Dwarf[100];
	for(y = 0; y < 100; ++y) {
		dw[y] = new Dwarf();
		 x = rand.nextInt(7)+ 1;
		int z = rand.nextInt(100)+1;
		if (x == 1) {
                dw[y].setName("Grumpy");
            } else if (x == 2) {
                dw[y].setName("Dopey");
            } else if (x == 3) {
                dw[y].setName("Doc");
            } else if (x == 4) {
                dw[y].setName("Happy");
            } else if (x == 5) {
                dw[y].setName("Bashful");
            } else if (x == 6) {
                dw[y].setName("Sneezy");
            } else if (x == 7) {
                dw[y].setName("Sleepy");
            }
            dw[y].setAge(z);
	}
	y = 0;
	for(x = 0; x <100; x++) {
		if(!dw[0].isSameName(dw[x].getName())) continue;
		y++;
	}
	System.out.println(dw[0].getName() + " was the name with " + y + " matches");


		
	

		
	}
}
