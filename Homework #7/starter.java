import java.util.Scanner;
import java.util.Random;


class dog {
	String name;
	int age;
	String breed;
	Random rand = new Random();
	int isSleep;
	
	public dog() {
		name = "Clifford";
		age = 3;
		breed = "big red dog";
		isSleep = rand.nextInt(2) + 1;
	
	}
	public dog(String a) {
		name = a;
		age = 1;
		breed = "dog dog";
		isSleep = rand.nextInt(2) + 1;
		
	}
	public dog(String x, String y) {
		name = x;
		breed = y;
		age = 1;
		isSleep = rand.nextInt(2) + 1;
		
	}
	public dog(String b, int c) {
		name = b;
		age = c;
		breed = "dog dog";
		isSleep = rand.nextInt(2) + 1;
	}
	public void setName(String name1) {
		name = name1;
		return;
	}
	public void setAge(int age1) {
		age = age1;
		return;
	}
	public void setBreed(String breed1) {
		breed = breed1;
		return;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getBreed() {
		return breed;
	}
	public boolean isSleeping() {
		if (isSleep == 1) {
			return true;
			}
			else {
				return false;
			}
		
	}
	public void bark() {
		System.out.println(name + "barks");
	}
	
		
		
}
class starter {
	public static void main(String args[]) {
	dog dogfir = new dog("Pooche");
	dogfir.setAge(5);
	
	dog dogsec = new dog("Bob", "bro");
	
	if(dogfir.isSleeping()) {
		System.out.println(dogfir.getName() + " is asleep.");
	}
	else {
		System.out.println(dogfir.getName() + " barks");
	}
	if(dogsec.isSleeping()) {
		if(!dogfir.isSleeping()) {
			System.out.println(dogsec.getName() + " barks");
		}
		else {
			if(!dogfir.isSleeping()) {
				System.out.println(dogsec.getName() + "barks");
			}
		}
	}
}


}