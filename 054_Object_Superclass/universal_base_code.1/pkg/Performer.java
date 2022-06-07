package pkg;
import java.util.Scanner;
import java.util.Random;


public class Performer {
	String name;
	int age;
	
	public Performer() {
		this.name = "Doja Cat";
		this.age = 26;
	}
	
	public Performer(String n, int x) {
		this.name = n;
		this.age = x;
	}
	public Performer(String n) {
		this.name = n;
		this.age = 26;
	}
	public String getName() {
		return this.name;
	}
	public String toString() {
		return(this.name + " is " + this.age + " years old");
	}
	public boolean equals(Object other) {
		if(!(other instanceof Performer)) {
			return false;
		}
		else {
			return this.name == this.name;
		}
	}
	
	public void practice() {
		System.out.println(this.name + " practices");
	}
	public void perform() {
		System.out.println(this.name + " performs on stage");
	}
}

