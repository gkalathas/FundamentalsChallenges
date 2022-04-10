package roomChallenge;

public class couch {
	private String manufacturer;
	private String type;
	private couchDimensions dimensions;
	private pillows pillows;
	
	public couch(String manufacturer, String type, couchDimensions dimensions, roomChallenge.pillows pillows) {
		this.manufacturer = manufacturer;
		this.type = type;
		this.dimensions = dimensions;
		this.pillows = pillows;	
	}
	

	public String getManufacturer() {
		return manufacturer;
	}

	public String getType() {
		return type;
	}

	public couchDimensions getDimensions() {
		return dimensions;
	}

	public pillows getPillows() {
		return pillows;
	}
	
	

}
