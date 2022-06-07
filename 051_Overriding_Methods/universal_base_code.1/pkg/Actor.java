package pkg;
import java.util.Scanner;
import java.util.Random;


public class Actor extends Performer {
	String type;
	
	public Actor() {
		type = "theater";
	}
	public Actor(String name, String type) {
		this.name = name;
		this.type = type;
	}
	public void practice() {
		System.out.println(this.name + " practices everyday for their dream role");
	}
	public void perform() {
		System.out.println(this.name + " deilveres a spectactular performance");
	}
	public void monologue(){
		System.out.println(" You know, I don’t think what you are doing is funny. In fact, I think it is sad. You think you’re cool because you grew faster than some people, and now you can beat them up? What is cool about hurting people? We are all here pretending that you’re a leader, when really, I know that you’re nothing but a mean bully! All this time I’ve been scared to say that, but just now, I realized that I’m not afraid of bullies—so, I won’t be afraid of you!");
	}
	
}

