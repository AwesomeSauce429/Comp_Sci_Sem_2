import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Dog Snoopy = new Dog();						
		Dog Snoopy2 = new Dog(36);					
		Dog Snoop3 = new Dog(true);					
		Dog Toto = new Dog("Toto");					
		Dog Clifford = new Dog("Clifford", true);	
		Dog Scooby = new Dog("Scooby", 50, false);	

		Cat Felix = new Cat("Felix", 100, true);	

		System.out.println();
		Clifford.trick();							
		Scooby.trick();								
		Felix.trick();
	}
}
