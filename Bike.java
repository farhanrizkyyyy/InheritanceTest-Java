package InheritanceTest;

public class Bike extends Vehicle {
	private String bikeType;
	
	public Bike(int wheels, String bikeType) {
		super(wheels);
		this.bikeType = bikeType;
	}
	
	public String getBikeType() {
		return bikeType;
	}
}
