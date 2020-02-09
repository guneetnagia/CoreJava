package guneet.DesignPattern.Factory2;

public class MainVehicle {
	public static void main(String aaa[]){
		VehicleFactory vf = new VehicleFactory();
		// Two Wheeler
		Vehicle v1 = vf.getVehicle("Two");
		v1.printVehicle();
		// Four Wheeler
		Vehicle v2 = vf.getVehicle("Four");
		v2.printVehicle();
	}
}
