package it.engim.esAssocEngim;

public class AssociatedEngim {
	
	private PartnerEngim [] list;
	
	public AssociatedEngim(int i) {
		
		list = new PartnerEngim[i];
		
	}

	public PartnerEngim[] getList() {
		
		return list;
		
	}

	public void setList(PartnerEngim[] list) {
		
		this.list = list;
		
	}
	
	public static PartnerEngim getPartnerCreditMax(PartnerEngim [] list) {
		
		PartnerEngim partnerEngimMaxCredit = new PartnerEngim();
		
		for (int i = 0; i < list.length; i++) {
			
			for (int y = 0; y < list.length; y++) {
				
				if (partnerEngimMaxCredit.getCredit() < list[y].getCredit()) {
					
					partnerEngimMaxCredit = list[y];
					
				}
				
			}
			
		}
		
		return partnerEngimMaxCredit;
		
	}
	
	public static PartnerPremium getPartnerPointCanteenMax(PartnerEngim [] list) {
		
		PartnerPremium partnerEngimMaxPointCanteen = new PartnerPremium();
		
		for (int i = 0; i < list.length; i++) {
		
			if (list[i] instanceof PartnerPremium) {
					
			
				if (((PartnerPremium) list[i]).getPointCanteen() >= partnerEngimMaxPointCanteen.getPointCanteen()) {
						
						partnerEngimMaxPointCanteen = (PartnerPremium) list[i];
					
				}
				
			}
			
		}
		
		
		return partnerEngimMaxPointCanteen;
		
	}

}
