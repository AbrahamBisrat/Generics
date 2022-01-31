package covariance;

public class Printer <T extends Animal>{
	T thingToPrint;
	
	public Printer(T thingToPring) {
		this.thingToPrint = thingToPring;
	}
	
	public void print() {
		System.out.println(thingToPrint + " !!!!!");
	}
}
