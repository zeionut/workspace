package it.engim.esAssocEngim;

public class PartnerEngim extends Person {
	
	protected int cardEngim;
	protected int credit;
	
	protected static int count = 0;
	
	public PartnerEngim() {
		
		super();
		
		this.cardEngim = count++;
		this.credit = 0;
		
	}
	
	public PartnerEngim(String name, String surname, int birthYear , int credit) {
		
		super(name, surname, birthYear);
		
		this.cardEngim = count++;
		this.credit = credit;
		
	}

	public int getCardEngim() {
		
		return cardEngim;
		
	}

	public void setCardEngim(int cardEngim) {
		
		this.cardEngim = cardEngim;
		
	}

	public int getCredit() {
		
		return credit;
		
	}

	public void setCredit(int credit) {
		
		this.credit = credit;
		
	}
	
	@Override
	public String toString() {
		
		return super.toString() + " cardEngim " + cardEngim + " credit " + credit;
		
	}
	
	public int upCredit(int hour) {
		
		this.credit = this.credit + (hour*5);
		
		return this.credit;
		
	}
	
	public void addHourLesson(int hour) {
		
		upCredit(hour);
		
	}
	
	public void addHourLessonStandar() {
		
		addHourLesson(4);
		
	}
	
}
