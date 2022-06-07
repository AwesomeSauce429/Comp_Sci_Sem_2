package pkg;
import java.util.ArrayList;

public class DesignerShirts extends Clothing {
    String brand;

    
    
    public DesignerShirts(String b) {
        this.brand = b;

    }
    
    public void Hype() {
        System.out.println("Your shirt is made by " + brand);
    }
}