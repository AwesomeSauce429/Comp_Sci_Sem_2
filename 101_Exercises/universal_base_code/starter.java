import pkg.Ascii;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Ascii drawing = new Ascii();
		drawing.setType("Smile");
		drawing.setName("John");
		drawing.setNumber(4);
		drawing.setAscii("<-->");
		drawing.printArt();
		
		Ascii some = new Ascii();
		some.printArt();
		
		Ascii some1 = new Ascii("dog");
		some1.printArt();
		
		Ascii bruhbro = new Ascii("Cactus", "DAWG");
		bruhbro.printArt();
		
		Ascii yomama = new Ascii("other", 5);
		yomama.printArt();
		
	}
}
