package pkg;
import java.util.Scanner;
import java.util.Random;


public class Apprentice extends Musician {
	String school;
	int yearsOfExperience;
	
	public Apprentice() {
		school = "CVHS";
		yearsOfExperience = 0;
	}
	public Apprentice(String school, int yearsOfExperience) {
		this.school = school;
		this.yearsOfExperience = yearsOfExperience;
	}
	public Apprentice(String instrument, String school, int yearsOfExperience) {
		this.instrument = instrument;
		this.school = school;
		this.yearsOfExperience = yearsOfExperience;
	}
	public Apprentice(String name, int age, String instrument, String school, int yearsOfExperience) {
		this.name = name;
		this.age = age;
		this.instrument = instrument;
		this.school = school;
		this.yearsOfExperience = yearsOfExperience;
	}
	public String toString(){
		return(this.name + " plays the " + this.instrument + " at " + this.school);
	}
	public void playInstrument() {
		System.out.println("The " + this.instrument + " is played with much skill");
	}
	public void practice(){
		super.practice();
		System.out.println(this.name + " has practiced for " + yearsOfExperience + " years");
	}
	public void perform() {
		super.perform();
		System.out.println(this.name + " performed on stage to a sold out venue");
	}
	public void practiceAtUniversity() {
		super.practice();
		System.out.println(this.name + " practices the " + this.instrument + " at Harvard");
	}
}


