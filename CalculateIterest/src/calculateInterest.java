
public class calculateInterest {
	public static void main(String []args) {
		double interestRate=5.0;
		double amount =60000;
		for( interestRate = 0; interestRate<9; interestRate++ ) {
			System.out.println("The interest is" + calculateInterest(amount,interestRate));
		}
		System.out.println("****************");
		for(interestRate=8; interestRate>=2; interestRate--) {	
			System.out.println("60.000 euro at " + interestRate + "% interest = " + calculateInterest(amount,interestRate));
		}
		
	}
	public static double calculateInterest(double amount, double interestRate) {
		
		return(amount*(interestRate/100));
	}

}
