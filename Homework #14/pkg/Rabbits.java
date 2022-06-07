package pkg;
import pkg.Pet;
public class Rabbits

implements Pet {
    String name;
    int age;
    boolean trained;
    
    public Rabbits() {
        this("Joey", 15, true);
    }
    public Rabbits(String x) {
        this(x, 15, true);
    }

    public Rabbits(int y) {
        this("Bobby", y, true);
    }

    public Rabbits(boolean z) {
        this("Reggy", 15, z);
    }

    public Rabbits(String x, boolean z) {
        this(x, 15, z);
    }

    public Rabbits(String string, int y, boolean z) {
        this.name = string;
        this.age = y;
        this.trained = z;
        this.interact();
    }

    public void setName(String string) {
        this.name = string;
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
        System.out.println(this.name + " runs around");
    }

    public void trick() {
        if (this.trained) {
            System.out.println(this.name + " eats some lettuce");
        } else {
            System.out.println(this.name + " sleeps in his cage");
        }
    }
}
