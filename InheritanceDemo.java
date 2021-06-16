package InheritanceTest;

public class InheritanceDemo {
	public static void main(String[] args) {
		Convertible Toyota = new Convertible(4, 5, false, "Sun Roof");
		Motorbike Kawasaki = new Motorbike(2, "Super Sport", 600);
		
		//CAR
		System.out.println("----- CAR -----");
		System.out.println("Number of Doors on Toyota's Car	 : " + Toyota.getDoors());
		System.out.println("Number of Wheels on Toyota's Car : " + Toyota.getWheels());
		System.out.println("Roof Type of Toyota's Car	 : " + Toyota.getRoofType());

		String electric = Toyota.getIsElectric() ? "Yes" : "No";
		
		System.out.println("\nIs Toyota's Car Electric? " + electric);
		
		
		//BIKE
		System.out.println("\n\n----- BIKE -----");
		System.out.println("Number of Wheels on Kawasaki's Bike : " + Kawasaki.getWheels());
		System.out.println("Bike Type of Kawasaki's Bike	    : " + Kawasaki.getBikeType());
		System.out.println("Kawasaki's Bike is " + Kawasaki.getCc() + " CC.");
	}
}
