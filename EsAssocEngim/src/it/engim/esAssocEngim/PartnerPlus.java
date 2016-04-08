package it.engim.esAssocEngim;

public class PartnerPlus extends PartnerEngim {
	
	protected String email;
	
	public PartnerPlus() {
		
		super();
		
		this.email = null;
		
	}
	
	public PartnerPlus(String name, String surname, int birthYear , int credit, String email) {
		
		super(name, surname, birthYear, credit);
		
		this.email = email;
		
	}

	public String getEmail() {
		
		return email;
		
	}

	public void setEmail(String email) {
		
		this.email = email;
		
	}
	
	@Override
	public String toString() {
		
		return "name " + this.name + " surname " + this.surname + " birthYear " + this.birthYear + 
				" cardEngim " + cardEngim + " credit " + credit + " email " + email;
		
	}
	
	@Override
	public int upCredit(int hour) {
		
		this.credit = this.credit + (hour*10);
		
		return this.credit;
		
	}
	
	@Override
	public void addHourLesson(int hour) {
		
		upCredit(hour);
		
	}

}
