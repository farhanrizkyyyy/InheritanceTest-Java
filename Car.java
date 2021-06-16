package InheritanceTest;

public class Car extends Vehicle {
	private int doors;
	private boolean isElectric;
	
	public Car(int wheels, int doors, boolean isElectric) {
		super(wheels);
		this.doors = doors;
		this.isElectric = isElectric;
	}
	
	public int getDoors() {
		return doors;
	}
	
	public boolean getIsElectric() {
		return isElectric;
	}
}
