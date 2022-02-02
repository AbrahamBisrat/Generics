package covariance;

public class Dog extends Animal
		implements Comparable<Dog>{
	private String aggresiveness = "Normal";
	public Dog(String name, int age, String aggsv) {
		super(name, age);
		aggresiveness = aggsv;
	}
	public String getAggresivenesss() {
		return aggresiveness;
	}
	@Override public String shoutName() {
		return "Woofy Woof!!!";
	}
	@Override public String toString() {
		return "[Dog : " + name 
				+ "  age : " + age 
				+ "  Aggressiveness : " 
				+ aggresiveness + " ]";
	}
	@Override public int compareTo(Dog thatDog) {
		return this.age - thatDog.age;
	}
}
