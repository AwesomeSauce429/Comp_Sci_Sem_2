package pkg;
import java.util.ArrayList;
import java.util.Scanner;

public class Clothing {
    int price;
    String n;
    
	public void Price(int x) {
	    this.price = x;
	    System.out.println("It costs $" + x);
	}
	public void ClothingProd(String name) {
	    this.n = name;
	    System.out.println("It is made by " + n);
	}
	
}