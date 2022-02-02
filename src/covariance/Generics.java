package covariance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Generics {
	public static void main(String[] args) {
		
//		testCases();
		
//		pairGenericTest();
		
//		gangOfFourTests();		
		
		// <T extends Comparable<? super T>>
		
//		wildcardWithParentsTest();
		
//		assignmentTests();
		
//		streamReduceWithFlatMap();
		
		
	}

	private static void streamReduceWithFlatMap() {
		List<String> list1 = Arrays.asList("hellow", "there");
		List<String> list2 = Arrays.asList("good bye", "again");
		List<List<String>> combList = new ArrayList<>();
		combList.add(list1);
		combList.add(list2);
		
		System.out.println(combList);
		
		System.out.println(
			combList.stream()
					.flatMap(x -> x.stream())
					.reduce("output is : ", (output, each) -> output.concat(each).concat(" "))
		);
	}

	private static void assignmentTests() {
		List<Integer> ints = new ArrayList<>();
		ints.add(1);
		ints.add(2);
		List<? extends Number> nums = ints;
//		nums.add(3.14);
	}

	private static void wildcardWithParentsTest() {
		PrinterX<Dog> doggy = new PrinterX<>(
			new Dog("DogName", 1, "Very Aggressive")
		);
		
		doggy.print();
	}

	private static void gangOfFourTests() {
		GangOfFour<Dog, Dog, Cat, Cat> gangOfFour =
				new GangOfFour<>(
					new Dog("Mickey", 6, "Normal"),
					new Dog("Charley", 5, "Aggressive"),
					new Cat("Sissy", 1, "Normal"),
					new Cat("Liroy", 2, "Bitchy")
				);
		
		System.out.println(gangOfFour);
	}

	private static void pairGenericTest() {
		PairGeneric<String, Integer> gp =
				new PairGeneric<>("Abraham", 613787);
		
		System.out.println(gp + "\n");
		
		
		PairGeneric<Dog, Cat> dogNcat =
				new PairGeneric<>(
						new Dog("Rocky", 4, "Playful"), 
						new Cat("Sassy", 2, "Cuteness"));
		System.out.println(dogNcat);
	}

	private static void testCases() {
		//		List<Integer> ints = new ArrayList<>();
		//		ints.add(1);
		//		ints.add(2);
		//		List<Number> nums = ints;
		//		nums.add(3.14);
		//		System.out.println(ints);
				
				System.out.println("Generics, Is that you!?");
				
//				Printer<String> s = new Printer<>("what?");
//				s.print();
//				
//				Printer<Integer> i = new Printer<>(12345);
//				i.print();
				
				Dog jack = new Dog("Jack", 12, "Very Aggressive");
				Cat cuty = new Cat("Cuty", 2, "Adorable");
				List<Animal> animals = new ArrayList<>() {
					{
						add(jack);
						add(cuty);
					}
				};
				
				List<String> dogNames = new ArrayList<>() {
					{
						add("what is this");
						add("I don't know anymore");
						add("my hands are typing");
						add("some more tying");
						add("I think this is enough for the list");
					}
				};
				
				Printer<Dog> dogPrinter = new Printer<>(jack);
				Printer<Cat> catPrinter = new Printer<>(cuty);
				
				System.out.println("\n\n here");
				dogPrinter.print();
				catPrinter.print();
				
				
				Animal anCat = new Cat("Some cute name", 1, "Normal");
				Animal anDog = new Dog("Some Doggy name", 2, "Normal");
				
				Printer<Animal> dogPrint = new Printer<>(anDog);
				Printer<Animal> catPrint = new Printer<>(anCat);
				
		//		anPrinter.print();
		//		anPrinter2.print();
				
				System.out.println(dogPrint.shoutName());
				System.out.println(catPrint.shoutName());
				
				
				WildList.printList(animals);
		//		WildList.printList(dogNames);
				
				// Testing of a generic method that takes a list of strings
				// and returns a list of their reversed version.
				
				
				Generics.printList(animals);
				
				
				Pair pair = new Pair("Me", "I");
				System.out.println(pair);
	}
	
	private static void printList(List<?> list) {
		System.out.println(list);
	}
	
	private static void printReversed(List<String> list) {
//		List<String> newList = Collections.reverse(list);
		
	}
}