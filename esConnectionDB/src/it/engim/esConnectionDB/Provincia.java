package it.engim.esConnectionDB;

public class Provincia {
	
	private int id;
	private String nome;
	private String sigla;
	private int abitanti;
	private float superficie;
	private int comuni;
	private int regione;
	
	public Provincia(int id, String nome, String sigla, int abitanti, 
			float superficie, int comuni, int regione) {
		
		this.id = id;
		this.nome = nome;
		this.sigla = sigla;
		this.abitanti = abitanti;
		this.superficie = superficie;
		this.comuni = comuni;
		this.regione = regione;
		
	}

	public int getId() {
		
		return id;
		
	}

	public void setId(int id) {
		
		this.id = id;
		
	}
	
	public String getNome() {
		
		return nome;
		
	}

	public void setNome(String nome) {
		
		this.nome = nome;
		
	}


	public String getSigla() {
		
		return sigla;
		
	}

	public void setSigla(String sigla) {
		
		this.sigla = sigla;
		
	}

	public int getAbinti() {
		
		return abitanti;
		
	}

	public void setAbinti(int abitanti) {
		
		this.abitanti = abitanti;
		
	}

	public float getSuperficie() {
		
		return superficie;
		
	}

	public void setSuperficie(float superficie) {
		
		this.superficie = superficie;
		
	}

	public int getComuni() {
		
		return comuni;
		
	}

	public void setComuni(int comuni) {
		
		this.comuni = comuni;
		
	}

	public int getRegione() {
		
		return regione;
		
	}

	public void setRegione(int regione) {
		
		this.regione = regione;
		
	}

}
