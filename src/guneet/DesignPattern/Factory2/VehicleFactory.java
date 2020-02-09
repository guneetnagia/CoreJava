package guneet.DesignPattern.Factory2;

public class VehicleFactory {
	public Vehicle getVehicle(String type){
		if(type.equalsIgnoreCase("Two")){
			return new TwoWheeler();
		}
		else if(type.equalsIgnoreCase("Four")){
			return new FourWheeler();
		} 
		return null;
	}
}
