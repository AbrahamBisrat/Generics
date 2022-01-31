package covariance;

public class Animal {
	protected String name;
	protected int age;
	
	public Animal(String n, int a) {
		name = n;
		age = a;
	}
	
	public String shoutName() {
		return name + " ?!!!!!";
	}
	
	public String eat() {
		return "This is the Animal eating!";
	}
}
