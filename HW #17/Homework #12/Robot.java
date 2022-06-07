import java.util.Scanner;
import java.util.Random;


class Robot {
public int[] hall;
public int pos;
public boolean facingRight;

private boolean forwardMoveBlocked() {
	if(facingRight && pos >= hall.length - 1 ) {
		return true;
	}
	else if(!facingRight && pos == 0) {
		return true;
	}
	else {
		return false;
	}
}
private void move() {
    if (hall[pos] > 0){
        hall[pos]--;
    }
    if (hall[pos] == 0) {
        if (forwardMoveBlocked()) {
            facingRight = !facingRight;
        }
        else if (facingRight) {
            pos++;
        }
        else {
            pos--;
        }
    }
}
public int clearHall() {
    int x = 0;
    while (!hallIsClear()) {
        move();
        x++; 
    }
    return x; 
}



}


}
