package roomChallenge;

public class television {
	private String manufacturer;
	private String shape;
	private resolution tvResolution;
	private int inches;
	
	public television(String tvHeight, String tvWidth) {
		if (tvHeight="640", tvWidth="480" ) {
			System.out.println("the resolution is standart hd");
		}
		else if (tvHeight = 720 , tvWidth = 1280) {
			System.out.println("the resolution is hd ready");
		}
		else if (tvHeight= 1080 , tvWidth = 1920) {
			System.out.println("the resolution is full hd");
		}
		else if(tvHeight= 2160, tvWidth=3840) {
			System.out.println("the resolution is 4k");
		}
		}

	public String getManufacturer() {
		return manufacturer;
	}

	public String getShape() {
		return shape;
	}

	public resolution getTvResolution() {
		return tvResolution;
	}

	public int getInches() {
		return inches;
	}
}

