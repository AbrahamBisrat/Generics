package covariance;

import java.util.ArrayList;
import java.util.List;

public class NumberNInts {
	public static void main(String[] args) {
		
//		List<Integer> ints = new ArrayList<>();
//		ints.add(1);
//		ints.add(2);
//		List<Number> nums = ints;
//		nums.add(3.14);
//		System.out.println(ints);
		
		System.out.println("Generics, Is that you!?");
		
//		Printer<String> s = new Printer<>("what?");
//		s.print();
//		
//		Printer<Integer> i = new Printer<>(12345);
//		i.print();
		
		Dog jack = new Dog("Jack", 12, "Very Aggressive");
		Cat cuty = new Cat("Cuty", 2, "Adorable");
		
		Printer<Dog> dogPrinter = new Printer<>(jack);
		Printer<Cat> catPrinter = new Printer<>(cuty);
		
		dogPrinter.print();
		catPrinter.print();
		
		
		Animal anDog = new Dog("Some Doggy name", 2, "Normal");
		Animal anCat = new Cat("Some cute name", 1, "Normal");
		
		Printer<Animal> anPrinter2 = new Printer<>(anDog);
		Printer<Animal> anPrinter = new Printer<>(anCat);
		
		anPrinter.print();
		anPrinter2.print();
		
	}
}
