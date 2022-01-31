package covariance;

public class Printer <T extends Animal>{
	T animal;
	
	public Printer(T animal) {
		this.animal = animal;
	}
	
	public void print() {
		System.out.println(animal + " !!!!!");
	}
	
	// okay, let's do something more realistic
	public String eat() {
		return animal.eat();
	}
	
	public String shoutName() {
		return animal.shoutName();
	}
}
