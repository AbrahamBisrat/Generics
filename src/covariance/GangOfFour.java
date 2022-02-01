package covariance;

public class GangOfFour <S, T, U, R>{
	private final S first;
	private final T second;
	private final U third;
	private final R fourth;
	
	public GangOfFour(S s, T t, U u, R r) {
		first = s;
		second = t;
		third = u;
		fourth = r;
	}
	
	@Override public String toString() {
		return "Gang of four ["
				+ "\n***{First Element -> "
				+ "  type : " + first.getClass() 
				+ "  value : " + first + " }"
				+ "\n***{Second Element -> "
				+ "  type : " + second.getClass().getName() 
				+ "  value : " + second + "} ]"
				+ "\n***{Third Element -> "
				+ "  type : " + third.getClass() 
				+ "  value : " + third + " }"
				+ "\n***{Fourth Element -> "
				+ "  type : " + fourth.getClass().getName() 
				+ "  value : " + fourth + "} ]";
		
	}
}
