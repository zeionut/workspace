package it.engim.esExtends;

public class Bicycle {
	
	protected String model;
	protected Person owner;
	protected int velocity;
	protected int gear;
	
	public Bicycle() {
		
		this.model = null;
		this.owner = new Person();
		this.velocity = 0;
		this.gear = 0;
		
	}
	
	public Bicycle(String model, Person owner, int velocity, int gear) {
		
		this.model = model;
		this.owner = owner;
		this.velocity = velocity;
		this.gear = gear;
		
	}
	
	public Bicycle(String model, Person owner) {
			
			this.model = model;
			this.owner = owner;
			this.velocity = 0;
			this.gear = 0;
			
	}
	
	public String getModel() {
		
		return this.model;
	}
	
	public void setModel(String model) {
		
		this.model = model;
		
	}
	
	public Person getOwner() {
		
		return this.owner;
		
	}
	
	
	public String getOwnerString() {
		
		return this.owner.getStampPerson();
		
	}
	
	public void setOwner(Person owner) {
		
		this.owner = owner;
		
	}
	
	public int getVelocity() {
	
		return this.velocity;
		
	}
	
	public void setVelocity(int velocity) {
		
		this.velocity = velocity;
		
	}
	
	public int getGear() {
	
		return this.gear;
		
	}
	
	public void setGear(int gear) {
		
		this.gear = gear;
		
	}
	
	public String getOwnerName() {
		
		return this.owner.getName();
		
	}
	
	public void stampBicycle() {
		
		System.out.println("Modello: " + this.model + 
				" Il proprietario è " + this.owner + 
				" Il proprietario è " + this.owner +
				" la marcia attuale è " + this.gear);
		
	}
	
	public void changeGear(int gear) {
		
		int temp = this.gear;
		
		this.gear = gear;
		
		System.out.println("marcia da " + temp + " cambiata a --> " + this.gear + "\n");
		
	}
	
	public void acceleration() {
		
		int temp = this.velocity;
		
		this.velocity = this.velocity + this.gear;
		
		System.out.println("velocità da " + temp + " passata a --> " + this.velocity + "\n");
		
	}
	
	@Override
	public String toString() {
		
		return "model " + this.model + " person " + this.owner.getName() + 
				" velocity " + this.velocity + " gear " + gear;
		
	}

}
