package it.engim.esAstrac;

public class EngimMarket {
	
	private Marketable [] listMark;	
	private int cash;
	private int ind;
	
	public EngimMarket(int i) {
		
		listMark = new Marketable[i];
		
		this.cash = 0;
		this.ind = 0;
		
	}
	
	public EngimMarket(Marketable [] listMark) {
		
		this.listMark = listMark;
		this.cash = 0;
		this.ind = 0;
		
	}

	public Marketable[] getListObj() {
		
		return listMark;
		
	}

	public void setListObj(Marketable[] listObj) {
		
		this.listMark = listObj;
		
	}

	public int getCash() {
		
		return cash;
		
	}

	public void setCash(int cash) {
		
		this.cash = cash;
		
	}
	
	public void sellObj(Marketable mark) {
		
		if ((listMark.length - 1) >= ind) {
		
			listMark[ind] = mark;
			
			cash += mark.getPrice();
			
			ind++;
		
		}
		
		else {
				
			Marketable [] tempListMark = new Marketable[ind + 1];
			
			for (int i = 0; i < listMark.length; i++) {
				
				tempListMark[i] = listMark[i];
				
			}
			
			cash += mark.getPrice();
			
			tempListMark[ind] = mark;
			
			ind++;
			
			listMark = tempListMark;
			
		}
	}
	
	public String toString() {
		
		String listMarkToString = "";
		
		if (ind > 0) {
		
			for (int i = 0; i < ind; i++) {
				
				listMarkToString = listMarkToString + "Oggetto: " + listMark[i].toString() + "\n";
				
			}
			
		}
		
		return "Cassa: " + cash + "\n" + listMarkToString;
		
	}
	
	public int getCashDis(int num) {
		
		int calCash = 0;
		
		for (int i = 0; i < ind; i++) {
			
			if (listMark[i] instanceof Discount) {
			
				calCash += ((Discount) listMark[i]).discounted(num);
			
			}
			
			else {
				
				calCash += listMark[i].getPrice();
				
			}
			
		}
		
		return calCash;
		
	}
	
	public int countBicy() {
		
		int numBicy = 0;
		
		for (int i = 0; i < ind; i++) {
			
			if (listMark[i] instanceof Bicycle) {
				
				numBicy++;
				
			}
			
		}
		
		return numBicy;
		
	}
	
}
