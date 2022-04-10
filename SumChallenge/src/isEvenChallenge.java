
public class isEvenChallenge {
	public static void main(String [] args) {
		int number = 1;
		int finishNumber = 40;
		
		int totalNumber=0;
		while(number<=finishNumber) {
			number ++;
			if(!isEvenNumber(number)) {
				continue;
			}
			System.out.println("even number is" + number);
			totalNumber++;
			if(totalNumber>=10) {
				break;
			}
			
			
		}
		System.out.println("even numbers found" + totalNumber);
	}
	
	public static boolean isEvenNumber(int number) {
		if(number%2==0) {
			return true;
		}
		else {
			return false;
		}
	}

}
