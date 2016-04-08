package it.engim.esAssocEngim;

public class PartnerPremium extends PartnerPlus{
	
	protected int creditCaffe;
	protected int pointCanteen;
	
	public PartnerPremium() {
		
		super();
		
		this.creditCaffe = 0;
		this.pointCanteen = 0;
		
	}
	
	public PartnerPremium(String name, String surname, int birthYear, 
			int credit, String email, int creditCaffe, int pointCanteen) {
		
		super(name, surname, birthYear, credit, email);
		
		this.creditCaffe = creditCaffe;
		this.pointCanteen = pointCanteen;
		
	}

	public int getCreditCaffe() {
		
		return creditCaffe;
		
	}

	public void setCreditCaffe(int creditCaffe) {
		
		this.creditCaffe = creditCaffe;
		
	}

	public int getPointCanteen() {
		
		return pointCanteen;
		
	}

	public void setPointCanteen(int pointCanteen) {
		
		this.pointCanteen = pointCanteen;
		
	}
	
	@Override
	public String toString() {
		
		return "name " + this.name + " surname " + this.surname + " birthYear " + this.birthYear + 
				" cardEngim " + cardEngim + " credit " + credit + " email " + email + 
				" creditCaffe " + creditCaffe + " pointCanteen " + pointCanteen;
		
	}
	
	public int upPointCanteen(int hour) {
		
		this.pointCanteen =  this.pointCanteen + hour;
		
		return this.pointCanteen;
		
	}
	
	@Override
	public void addHourLesson(int hour) {
		
		upCredit(hour);
		upPointCanteen(hour);
		
	}
	
	@Override
	public void addHourLessonStandar() {
		
		upCredit(4);
		upPointCanteen(4);
		
	}
	

}
