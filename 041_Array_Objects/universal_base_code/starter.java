import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int x;
		Wizard[] wiz = new Wizard[100];
		Warrior[] war = new Warrior[100];
		for(x = 0; x < 100; x++) {
			wiz[x] = new Wizard();
			war[x] = new Warrior();
		}
		x = 0;
		int y = 0;
		Random rand = new Random();
		int z = rand.nextInt(2);
		while(!wiz[99].isDead() || !war[99].isDead()) {
			if(z == 0) {
				wiz[x].attack(war[y]);
				if(war[y].isDead()) {
					if(war[99].isDead()) break;
					++y;
						
					
				}
				war[y].attack(wiz[x]);
				if(!wiz[x].isDead()) continue;
				if(wiz[99].isDead()) break;
				++x;
				continue;
			}
			war[y].attack(wiz[x]);
			if(war[x].isDead()) {
				if(wiz[99].isDead()) break;
				++x;
			}
			wiz[x].attack(war[y]);
			if(!war[y].isDead()) continue;
			if(war[y].isDead())  break;
			++y;
		}
		if(wiz[99].isDead()) {
			System.out.println("Warriors have won with " + (100 - y) + " left in their army.");
			
		}
		if(war[99].isDead()) {
			System.out.println("Wizards have won with " + (100 - x) + " left in their army");
		}
		
	}
}
