package pkg;
import java.util.Scanner;
import java.util.Random;


public class Course{
	String teacher;
	int grade;
	int credit;
	
	public Course calcCredit(int g, int c) {
		this.grade = g;
		this.credit = c;
	}

}

