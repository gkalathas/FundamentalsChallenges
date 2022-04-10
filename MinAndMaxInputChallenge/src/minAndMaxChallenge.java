import java.util.Scanner;
public class minAndMaxChallenge {

	public static void main(String[] args) {
		int maximum =0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		int number = scan.nextInt();
		while(number>=0 && number != maximum) {
			if(number>maximum){
				maximum=number;
			}
		break;	
		}
		System.out.println("the minimum number is" + number + "the maximum number is" + maximum);
		

	}

}

