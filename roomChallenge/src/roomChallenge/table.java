package roomChallenge;

public class table {
	private String shape;
	private String type;
	private int numberOfLegs;
	public table(String shape, String type, int numberOfLegs) {
		this.shape = shape;
		this.type = type;
		this.numberOfLegs = numberOfLegs;
	}
	public String getShape() {
		return shape;
	}
	public String getType() {
		return type;
	}
	public int getNumberOfLegs() {
		return numberOfLegs;
	}
	
	

}
