package jj.org.facade;

public class Rider {

	Bike bike = new Bike();
	BikeFacade facade = new BikeFacade();
	public Bike getBike() {
		return bike;
	}

	public void setBike(Bike bike) {
		this.bike = bike;
	}

	public static void main(String[] args) {

		Rider rider = new Rider();
		
		//Regular invocation, without Facade 
		Bike cbr = rider.getBike();

		// Starting bike now

		cbr.sitOnBike();
		cbr.removeStand();
		cbr.checkFuelTank();
		cbr.startIgnition();
		cbr.startEngine();
		cbr.clutchAndGearUp();
		cbr.twistThrottle();

		// now trying to stop bike

		cbr.applyBrakes();
		cbr.closeThrottle();
		cbr.clutchAndGearDown();
		cbr.stopEngine();
		cbr.killIgnition();
		cbr.putBikeOnStand();
		cbr.getOffBike();
		
		
		//invocation through Facade pattern 
		System.out.println("invocation through Facade pattern");
		
		rider.facade.startBike();
		rider.facade.stopBike();

	}

}