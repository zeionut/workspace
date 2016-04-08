package it.engim.esConnectionDB;


public class Regione {
	
	private int id;
	private String name;
	private Provincia[] province;
	
	public Regione(int id) {
		
		this.id = id;
		name = ConnectionManager.getRegioneName(id);
		province = ConnectionManager.getProvincieFromIdRegione(id);
		
	}
	
	public Regione(int id, String name, Provincia [] province) {
		
		this.id = id;
		this.name = name;
		this.province = province;
		
	}

	public int getId() {
		
		return id;
		
	}

	public void setId(int id) {
		
		this.id = id;
		
	}

	public String getName() {
		
		return name;
		
	}

	public void setName(String name) {
		
		this.name = name;
		
	}

	public Provincia[] getProvince() {
		
		return province;
		
	}

	public void setProvince(Provincia[] province) {
		
		this.province = province;
		
	}
	
	@Override
	public String toString() {
		
		String provinceToString = "";
		
		for (int i = 0; i < province.length; i++) {
			
			provinceToString += province[i].getNome() + " ";
			
		}
		
		return "id " + id + " name " + name + " provice " + provinceToString;
		
	}

}
