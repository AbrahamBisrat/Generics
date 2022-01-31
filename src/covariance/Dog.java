package covariance;

public class Dog extends Animal{
	
	private String aggresiveness = "Normal";
	
	public Dog(String name, int age, String aggsv) {
		super(name, age);
		aggresiveness = aggsv;
	}
	
	@Override public String shoutName() {
		return "Woofy Woof!!!";
	}
	
	public String getAggresivenesss() {
		return aggresiveness;
	}
	
	@Override public String toString() {
		return "[Cat : " + name 
				+ "\t age : " + age 
				+ "\tAggressiveness : " 
				+ aggresiveness + " ]";
	}
}
