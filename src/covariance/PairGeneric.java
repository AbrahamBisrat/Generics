package covariance;

public class PairGeneric <T, U>{
	private final T first;
	private final U second;
	
	public PairGeneric(T first, U second) {
		this.first = first;
		this.second = second;
	}
	
	public T getFirst() {
		return first;
	}
	
	public U getSecond() {
		return second;
	}
	
	@Override public String toString() {
		return "Generic Pair [ ***{First Element -> "
				+ "  type : " + first.getClass() 
				+ "  value : " + first + " }"
				+ " -->||<-- "
				+ "  ***{Second Element -> "
				+ "  type : " + second.getClass().getName() 
				+ "  value : " + second + "} ]";
	}
}