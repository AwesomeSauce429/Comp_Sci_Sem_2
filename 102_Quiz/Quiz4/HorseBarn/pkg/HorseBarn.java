package pkg;
import java.util.Scanner;
import java.util.Random;


public class HorseBarn extends Horse {
    
    
    public int findHorseSpace(String name) {
        for(int c = 0; c<spaces.length; c++) {
            if(name =spaces[c]) {
                return c;
            }
            return -1;
        }
        
    
    } 
    public void consolidate() {
        int i = 0;
        Horse[] area = new Horse[spaces.length];
        for(int c = 0; c < spaces.length; c++) {
            if(spaces[c] != null) {
                area[i] = spaces [c];
                i++;
            }
        }
        
    }



}
