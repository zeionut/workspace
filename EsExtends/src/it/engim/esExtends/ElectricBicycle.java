package it.engim.esExtends;

public class ElectricBicycle extends Bicycle {
	
	private int battery;
	
	public ElectricBicycle(String model, Person owner, int velocity, int gear, int battery) {
		
		super(model, owner, velocity, gear);
		
		this.battery = battery;
		
	}

	public int getBattery() {
		return battery;
	}

	public void setBattery(int battery) {
		this.battery = battery;
	}
	
	@Override
	public String toString() {
		
		return "model " + this.model + " person " + this.owner.getName() + 
				" velocity " + this.velocity + " gear " + gear + " battery " + battery;
		
	}

}
