package jj.org.factorymethod;

public class CarFactory extends VehicleFactory {
	@Override
	protected Vehicle createVehicle() {
		// TODO Auto-generated method stub
		return new Car();
	}
}
