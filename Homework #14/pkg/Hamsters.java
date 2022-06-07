package pkg;
import pkg.Pet;

public class Hamsters
implements Pet {
    String name;
    int age;
    boolean trained;

    public Hamsters() {
        this("Jimbo", 3, false);
    }

    public Hamsters(String x) {
        this(x, 3, false);
    }

    public Hamsters(int y) {
        this("Jimbo", y, false);
    }

    public Hamsters(boolean z) {
        this("Jimbo", 3, z);
    }

    public Hamsters(String x, boolean z) {
        this(x, 3, z);
    }

    public Hamsters(String x, int y, boolean z) {
        this.name = x;
        this.age = y;
        this.trained = z;
        this.interact();
    }

    
    public void setName(String x) {
        this.name = x;
    }

    
    public void setAge(int y) {
        this.age = y;
    }

    
    public void setIsTrained(boolean z) {
        this.trained = z;
    }

    
    public String getName() {
        return this.name;
    }

    
    public int getAge() {
        return this.age;
    }

    
    public boolean getIsTrained() {
        return this.trained;
    }

    
    public void interact() {
        System.out.println(this.name + " runs in his wheel");
    }

    
    public void trick() {
        if (this.trained) {
            System.out.println(this.name + " drinks water");
        } else {
            System.out.println(this.name + " eats whatever hamsters eats");
        }
    }
}
