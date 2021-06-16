package InheritanceTest;

public class Motorbike extends Bike {
	private int cc;
	
	public Motorbike(int wheels, String bikeType, int cc) {
		super(wheels, bikeType);
		this.cc = cc;
	}
	
	public int getCc() {
		return cc;
	}
}
