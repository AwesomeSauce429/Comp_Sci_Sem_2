import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
	int x;
	Random rand = new Random();
	Dwarf[] dw = new Dwarf[100];
	for(x = 0; x < 100; ++x) {
		dw[x] = new Dwarf();
		int y = rand.nextInt(7)+ 1;
		int z = rand.nextInt(100)+1;
		if (y == 1) {
                dw[x].setName("Grumpy");
            } else if (y == 2) {
                dw[x].setName("Dopey");
            } else if (y == 3) {
                dw[x].setName("Doc");
            } else if (y == 4) {
                dw[x].setName("Happy");
            } else if (y == 5) {
                dw[x].setName("Bashful");
            } else if (y == 6) {
                dw[x].setName("Sneezy");
            } else if (y == 7) {
                dw[x].setName("Sleepy");
            }
            dw[x].setAge(z);
	}
	for(x = 0; x <100; x++) {
		System.out.println("Dwarf " + (x +1) + ": " + dw[x].getName() + " is " + dw[x].getAge() + " years old");
	}


		
	}
}
