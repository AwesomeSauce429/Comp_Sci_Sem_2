package pkg;
import java.util.ArrayList;

public class Shirts extends Clothing {
    String material;
    int size;
    
    public Shirts(String m, int s) {
    	this.material = m;
    	this.size = s;
    }
    
    
    public void Mats() {
		System.out.println("The shirt is made out of " + material + " and sized at " + size);
    }

}