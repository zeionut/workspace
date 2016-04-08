package it.engim.esExtends;

public class CollectionBicy {
	
	private Bicycle [] bicyList;
	
	public CollectionBicy(int i) {
		
		this.bicyList = new Bicycle[i];
		
	}

	public Bicycle[] getBicyList() {
		
		return bicyList;
		
	}

	public void setBicyList(Bicycle[] bicyList) {
		
		this.bicyList = bicyList;
		
	}
	
	public boolean verifyExistedName(String name) {
		
		boolean verify = false;
		
		for (int i = 0; i < this.bicyList.length && !verify; i++) {
			
			if (name.equals(this.bicyList[i].getOwner().getName())) {
				
				verify = true;
				
			}
			
		}
		
		return verify;
		
	}
	
	public Bicycle findBicyFormName(String name) {
		
		boolean verify = false;
		
		Bicycle tempBicy = new Bicycle();
		
		for (int i = 0; i < this.bicyList.length && !verify; i++) {
			
			if (name.equals(this.bicyList[i].getOwner().getName())) {
				
				tempBicy = this.bicyList[i];
				
				verify = true;
				
			}
			
		}
		
		return tempBicy;
		
	}
	
	public boolean verifyBicy(String name) {
		
		boolean verify;
		
		Bicycle tempBicy = findBicyFormName(name);
		
		if (tempBicy instanceof ElectricBicycle) {
			
			verify = false;
			
		}
		
		else {
			
			verify = true;
			
		}
		
		
		return verify;
		
	}

}
