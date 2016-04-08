package it.zeion.addresSbook;

import it.zeion.contact.Contact;
import it.zeion.rubric.Rubric;

public class Main {

	public static void main(String[] args) {
		
		Contact con1 = new Contact("Giorgio", "Geronimo", "giorgiogeronimo@mail.com", "3455656575");
		Contact con2 = new Contact("Buba", "Zerboso", "bubazerboso@mail.com", "3334355445");
		Contact con3 = new Contact("Michele", "Bisol", "michelebisol@mail.com", "3453463435");
		Contact con4 = new Contact("Nico", "Bisol", "nicobisol@mail.com", "3453445673");
		Contact con5 = new Contact("Chi", "Abaco", "nicobisol@mail.com", "3453445673");
		Contact con6 = new Contact("Sene", "Frosen", "nicobisol@mail.com", "3453445673");
		Contact con7 = new Contact("Frega", "Morozzo", "nicobisol@mail.com", "3453445673");
		Contact con8 = new Contact("Fredo", "Madonnina", "nicobisol@mail.com", "3453445673");
		
		
		Rubric rubric = new Rubric("myRubric");
		
		rubric.addContact(con1);
		rubric.addContact(con2);
		rubric.addContact(con3);
		rubric.addContact(con4);
		rubric.addContact(con5);
		rubric.addContact(con6);
		rubric.addContact(con7);
		rubric.addContact(con8);
		
		System.out.println(rubric);
		
		rubric.removeContact(6);
		
		System.out.println(rubric);
		
		Rubric rubric2 = new Rubric("myRubric", rubric.shuffleRubric());
		
		System.out.println(rubric2);
		
		System.out.println(rubric.getContactByMap("Abaco"));
		
	}

}
