package covariance;

public class Animal {
	protected String name;
	protected int age;
	
	public Animal(String n, int a) {
		name = n;
		age = a;
	}
	
	public void shoutName() {
		System.out.println(name + " ?!!!!!");
	}
	
	public void eat() {
		System.out.println("This is the Animal eating!");
	}
}
