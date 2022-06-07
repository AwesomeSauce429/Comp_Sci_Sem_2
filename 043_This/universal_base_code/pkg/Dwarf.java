package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dwarf {
	String name;
	int age;
	
	public Dwarf(){
		this.name = " ";
		this.age = 0;
		
	}
	public Dwarf(String bob, int x) {
		this.name = bob;
		this.age = x;
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public void setName(String bob) {
		this.name = bob;
	}
	public void setAge(int x) {
		this.age = x;
	}
	public boolean isSameName(String bob) {
		return this.name.equals(bob);
	}


}

