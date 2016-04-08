package it.engim.esAssocEngim;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
					
		AssociatedEngim listEngim = new AssociatedEngim(6);
		
		listEngim.getList()[0] = new PartnerEngim("Gianni", "Cova", 1982, 10);
		listEngim.getList()[1] = new PartnerEngim("Luca", "Rossi", 1992, 5);
		listEngim.getList()[2] = new PartnerPlus("Flavio", "Mango", 1979, 30, "f.mango@emgim.it");
		listEngim.getList()[3] = new PartnerPlus("Vitruvio", "Sangos", 1973, 30, "v.angos@emgim.it");
		listEngim.getList()[4] = new PartnerPremium("Donal", "Moka", 1986, 15, "d.moka@emgim.it", 15, 5);
		listEngim.getList()[5] = new PartnerPremium("Gino", "Drus", 1981, 5, "g.drus@emgim.it", 15, 5);
		
		for (int i = 0; i < listEngim.getList().length; i++) {
			
			listEngim.getList()[i].addHourLesson(5);
			System.out.println(listEngim.getList()[i]);
			
		}
		
		System.out.println(listEngim.getPartnerCreditMax(listEngim.getList()));
		System.out.println(listEngim.getPartnerPointCanteenMax(listEngim.getList()));

	}

}
