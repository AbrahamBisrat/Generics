package covariance;

public class PairGeneric <T, U>{
	T first;
	U second;
	
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
		return "Generic Pair [ *{First Element ->>>> "
				+ "\ttype : " + first.getClass() 
				+ "\tvalue : " + first + " }"
				+ "......"
				+ "\t*{Second Element ->>>> "
				+ "\ttype : " + second.getClass().getName() 
				+ "\tvalue : " + second + "} ]";
				
	}
}
