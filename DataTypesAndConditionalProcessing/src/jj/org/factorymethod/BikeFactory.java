package jj.org.factorymethod;

public class BikeFactory extends VehicleFactory {
	@Override
	public Vehicle createVehicle() {
		return new Bike();
	}
}
