import java.util.Scanner;
import java.util.Random;

class Cat {
	String name;
	public Cat() {
	name = "Garfield";
	}
	public Cat(String x){
		name = x;
	}
	
	public void meow() {
		System.out.println("The cats name is " + name +" and they meow at each other");
		return;
	}
}


class starter {
	public static void main(String args[]) {
	Cat cat1 = new Cat("Odie");
	Cat cat = new Cat();
	cat.meow(); 
	cat1.meow();
}


}