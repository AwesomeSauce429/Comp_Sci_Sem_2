package pkg;

public interface Role {
    public void setHealth(int x);
    
    public int getHealth();
    
    public String getName();
    
    public void attack(Role name);
}