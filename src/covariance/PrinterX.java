package covariance;

public class PrinterX <T 
	extends Comparable<? super T>> {
	T dog;
	
	public PrinterX(T dog) {
		this.dog = dog;
	}
	
	public void print() {
		System.out.println(dog + " !!!!!");
	}
	
	// okay, let's do something more realistic
}
