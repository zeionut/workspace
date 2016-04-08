package it.engim.esAstrac;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EngimMarket market = new EngimMarket(1);
		
		Bicycle bicyA = new Bicycle("bmx", "Giorgio", 0, 0);
		Bicycle bicyB = new Bicycle("mb", "Linda", 10, 3);
		Bicycle bicyC = new Bicycle("graziella", "Giorgia", 5, 1);
		Book bookA = new Book("VaccaCarla", 167);
		Book bookB = new Book("Pazzia di una classe ora", 403);
		Book bookC = new Book("Mangio con conscienza gli altri", 345);
		Dog dogA = new Dog("Fido", 6, true);
		Dog dogB = new Dog("Fufi", 9, false);
		Dog dogC = new Dog("Bau", 3, true);
		Dog dogE = new Dog("Sintia", 5, false);
		
		market.sellObj(bicyA);
		market.sellObj(dogA);
		market.sellObj(dogB);
		market.sellObj(bookB);
		market.sellObj(bicyC);
		market.sellObj(dogC);
		market.sellObj(dogE);
		market.sellObj(bookC);
		market.sellObj(bicyB);
		market.sellObj(bookA);
		
		System.out.println(market);
		
		System.out.println("Cassa con sconto: " + market.getCashDis(30));
		System.out.println("Sono state vendute: " + market.countBicy());
		
		Marketable [] list = market.getListObj();
		
		/*for (int i = 0; i < list.length; i++)
			System.out.println(list[i]);*/
		
		Arrays.sort(list);
		
		System.out.println("");
		
		for (int i = 0; i < list.length; i++)
			System.out.println(list[i]);

	}

}
