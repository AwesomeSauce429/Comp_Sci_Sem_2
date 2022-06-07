import pkg.*;
import java.util.Scanner;
import java.util.Random;
import pkg.Cat;
import pkg.Dog;

class starter {
	public static void main(String args[]) {
	Rabbits rabbit = new Rabbits();
        Rabbits Rabbits2 = new Rabbits(12);
        Rabbits Rabbits3 = new Rabbits(true);
        Rabbits Rabbits4 = new Rabbits("Jeff");
        Rabbits Rabbits5 = new Rabbits("Jose", true);
        Rabbits Rabbits6 = new Rabbits("Bobby", 32, false);
        Hamsters hamster = new Hamsters("Jim", 50, true);
        System.out.println();
        Rabbits5.trick();
        Rabbits6.trick();
        hamster.trick();
}
}
