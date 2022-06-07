package pkg;
import java.util.ArrayList;

public class Socks extends Clothing {
    String type;
    String material;
    int size;
    
    public Socks(String m, int s, String t) {
    	this.material = m;
    	this.size = s;
    	this.type = t;
    }
    
    
    public void Man() {
		System.out.println("The shirt is made out of " + material + " sized at " + size + " and it is a " + type + " typa sock yk");
    }

}