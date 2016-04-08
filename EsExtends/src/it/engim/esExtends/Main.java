package it.engim.esExtends;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CollectionBicy list = new CollectionBicy(5);
		
		list.getBicyList()[0] = new Bicycle
				("bmx", new Person("Filippo", "Cocchia", 30), 10, 3);
		list.getBicyList()[1] = new Bicycle
				("graziella", new Person("Carla", "Pinos", 26), 10, 3);
		list.getBicyList()[2] = new Bicycle
				("mountain bike", new Person("Laura", "Periale", 30), 10, 3);
		list.getBicyList()[3] = new ElectricBicycle
				("mountain bike", new Person("Matteo", "Candeliere", 25), 10, 2, 9);
		list.getBicyList()[4] = new ElectricBicycle
				("bmx", new Person("Mattia", "Bosso", 25), 10, 2, 9);
		
		String name = "Mattia";
		
		if (list.verifyExistedName(name)) {
			
			if(list.verifyBicy(name))  {
				
				System.out.println(name + " ha una bici");
				System.out.println(list.findBicyFormName(name));
				
			}
			
			else {
				
				System.out.println(name + " ha una bici elettrica");
				System.out.println(list.findBicyFormName(name));
				
			}
			
		}
		
		
		

	}

}