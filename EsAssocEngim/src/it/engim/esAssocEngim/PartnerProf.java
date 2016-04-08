package it.engim.esAssocEngim;

public class PartnerProf extends PartnerEngim{
	
	protected String address;
	
	public PartnerProf() {
		
		super();
		
		this.address = null;
		
	}
	
	public PartnerProf(String name, String surname, int birthYear, int credit, String address) {
		
		super(name, surname, birthYear, credit);
		
		this.address = address;
		
	}

	public String getAddress() {
		
		return address;
		
	}

	public void setAddress(String address) {
		
		this.address = address;
		
	}
	
	@Override
	public String toString() {
		
		return "name " + this.name + " surname " + this.surname + " birthYear " + this.birthYear + 
				" cardEngim " + cardEngim + " credit " + credit + " address " + address;
		
	}

}
