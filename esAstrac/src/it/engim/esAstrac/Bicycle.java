package it.engim.esAstrac;

public class Bicycle implements Marketable{
	
	private String model;
	private String owner;
	private int velocity;
	private int gear;
	
	public Bicycle(String model, String owner, int velocity, int gear) {
		
		this.model = model;
		this.owner = owner;
		this.velocity = velocity;
		this.gear = gear;
		
	}
	
	public Bicycle() {
			
		this.model = null;
		this.owner = null;
		this.velocity = 0;
		this.gear = 0;
			
	}
	
	public String getModel(){
		
		return this.model;
	}
	
	public void setModel(String model){
		
		this.model = model;
		
	}
	
	public String getOwner(){
		
		return this.owner;
		
	}
	
	public void setOwner(String owner){
		
		this.owner = owner;
		
	}
	
	public int getVelocity(){
	
		return this.velocity;
		
	}
	
	public void setVelocity(int velocity){
		
		this.velocity = velocity;
		
	}
	
	public int getGear(){
	
		return this.gear;
		
	}
	
	public void setGear(int gear){
		
		this.gear = gear;
		
	}
	
	public String getOwnerName() {
		
		return this.owner;
		
	}
	
	public void stampBicycle(){
		
		System.out.println("Modello: " + this.model + 
				" Il proprietario è " + this.owner + 
				" la marcia attuale è " + this.gear);
		
	}
	
	public void changeGear(int gear){
		
		int temp = this.gear;
		
		this.gear = gear;
		
		System.out.println("marcia da " + temp + " cambiata a --> " + this.gear + "\n");
		
	}
	
	public void acceleration(){
		
		int temp = this.velocity;
		
		this.velocity = this.velocity + this.gear;
		
		System.out.println("velocità da " + temp + " passata a --> " + this.velocity + "\n");
		
	}
	
	@Override
	public String toString() {
		
		return "model " + this.model + " person " + this.owner + 
				" velocity " + this.velocity + " gear " + gear;
		
	}

	@Override
	public int getPrice() {
		
		return 50;
		
	}
	
	@Override
	public int compareTo(Object o) {
		
	    int comapre = ((getPrice() > ((Marketable) o).getPrice()) ? 1 : (getPrice() < ((Marketable) o).getPrice()) ? -1 : 0);
					
		return comapre;
		
	}

}
