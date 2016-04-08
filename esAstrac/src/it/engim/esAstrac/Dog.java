package it.engim.esAstrac;

public class Dog implements Marketable {
	
	private String name;
	private int age;
	private boolean gender;
	private int id;
	private static int counter = 0;
	
	public Dog(String name, int age, boolean gender) {
		
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.id = counter;
		counter++;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public int getId() {
		return id;
	}
	
	public void StampDogName() {
		
		System.out.print("Nome del cane: " + this.name);
		
	}
	
	 @Override
	 public String toString() {
		 
		 return "name " + name + " age " + age + " gender " + ((gender!=true) ? "female" : "male");
		 
	 }
	
	@Override
	public int getPrice() {
		
		return 20;
		
	}
	
	@Override
	public int compareTo(Object o) {
		
	    int comapre = ((getPrice() > ((Marketable) o).getPrice()) ? 1 : (getPrice() < ((Marketable) o).getPrice()) ? -1 : 0);
					
		return comapre;
		
	}

}
