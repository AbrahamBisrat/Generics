package covariance;

public class Cat extends Animal{

	private String cuteness = "Normal";
	
	public Cat(String name, int age, String ctns) {
		super(name, age);
		cuteness = ctns;
	}
	
	@Override public void shoutName() {
		System.out.println("Woof Woof!!!");
	}
	
	public String getCuteness() {
		return cuteness;
	}
	
	@Override public String toString() {
		return "[Cat : " + name + "\t age : " + age 
				+ "\tCuteness : " + cuteness + " ]";
	}
}
