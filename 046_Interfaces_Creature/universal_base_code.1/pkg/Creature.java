package pkg;

public interface Creature {
    public boolean isDead();
    
    public boolean takeDamage(int x);
    
    public String getName();
    
    public boolean takeHealth(int y);
    
    public void attack(Role name);
    
}