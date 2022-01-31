package covariance;

import java.util.List;

public class WildList <T extends Animal>{
	T customType;
	
	public WildList(T t) {
		customType = t;
	}
	
	public void doSmt() {
		System.out.println(customType + " from Gen class");
	}
	
	public static void printList(List<? extends Animal> list) {
		System.out.println(list);
	}
}
