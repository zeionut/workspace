package it.engim.esExtends;

public class Person {
	
	private String name;
	private String surname;
	private int age;
	
	public Person() {
		
		String name = null;
		String surname = null;
		int age = 0;
		
	}
	
	public Person(String name, String surname, int age) {
		
		this.name = name;
		this.surname = surname;
		this.age = age;
		
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
	
	public int getAge() {
		
		return age;
		
	}
	
	public void setAge(int age) {
		
		this.age = age;
		
	}
	
	public void stampPerson() {
		
		System.out.println(this.name + " " + this.surname + " di età " + this.age);
		
	}
	
	public String getStampPerson() {
		
		return this.name + " " + this.surname + " di età " + this.age;
		
	}

}
