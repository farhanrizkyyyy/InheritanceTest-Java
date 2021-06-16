package InheritanceTest;

public class Convertible extends Car {
	private String roofType;
	
	public Convertible(int wheels, int doors, boolean isElectric, String roofType) {
		super(wheels, doors, isElectric);
		this.roofType = roofType;
	}
	
	public String getRoofType() {
		return roofType;
	}
}
