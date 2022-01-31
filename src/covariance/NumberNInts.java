package covariance;

import java.util.ArrayList;
import java.util.List;

public class NumberNInts {
	public static void main(String[] args) {
		
		List<Integer> ints = new ArrayList<>();
		ints.add(1);
		ints.add(2);
		List<Number> nums = ints;
		nums.add(3.14);
		System.out.println(ints);
	}
}
