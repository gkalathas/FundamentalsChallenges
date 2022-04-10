
public class SpeedConverter {
	public static void main(String [] args) {
		double kilometersPerHour=65.45;
		
		printConversion(kilometersPerHour);
		
	}
	public static long toMilesPerHour(double kilometersPerHour) {
		if(kilometersPerHour<0) {
			return -1;
		}
		else {
			long milesPerHour = (long) (kilometersPerHour / 1.60934);
			
			return Math.round(milesPerHour);
		}
	}
	public static void printConversion(double kilometersPerHour) {
		
		if(kilometersPerHour<0) {
			System.out.println("invalid value");
		}
		else if(kilometersPerHour>=0){
			long miles = toMilesPerHour(kilometersPerHour);
			System.out.println(kilometersPerHour + "km/h = " + miles + "mi/h");
		}
	}
	

}
