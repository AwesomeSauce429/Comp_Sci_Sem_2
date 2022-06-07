package pkg;
import java.util.ArrayList;

public class Pants extends Clothing {
    int pa;
    
    public Pants(int pants) {
        this.pa = pants;
    }
    
    public void Legs() {
        System.out.println("Your pants are " + pa + " inches long");
    }
}