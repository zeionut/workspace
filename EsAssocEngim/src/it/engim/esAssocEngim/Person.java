package it.engim.esAssocEngim;

public class Person {
	
	protected String name;
	protected String surname;
	protected int birthYear;
	
	public Person() {
		
		this.name = null;
		this.surname = null;
		this.birthYear = 0;		
		
	}
	
	public Person(String name, String surname, int birthYear) {
		
		this.name = name;
		this.surname = surname;
		this.birthYear = birthYear;		
		
	}

	public String getName() {
		
		return name;
		
	}

	public void setName(String name) {
		
		this.name = name;
		
	}

	public String getSurname() {
		
		return surname;
		
	}

	public void setSurname(String surname) {
		
		this.surname = surname;
		
	}

	public int getBirthYear() {
		
		return birthYear;
		
	}

	public void setBirthYear(int birthYear) {
		
		this.birthYear = birthYear;
		
	}
	
	@Override
	public String toString() {
		
		return "name " + this.name + " surname " + this.surname + " birthYear " + this.birthYear;
		
	}

}
