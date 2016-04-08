package it.zeion.rubric;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import it.zeion.contact.Contact;

public class Rubric {
	
	protected String name;
	protected List<Contact> contactList;
	
	public Rubric(String name) {
		
		this.name = name;
		
		contactList = new ArrayList<>();
		
	}
	
	public Rubric(String name, List contactList) {
		
		this.name = name;
		this.contactList = contactList;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Contact> getContactList() {
		return contactList;
	}

	public void setContactList(List<Contact> contactList) {
		this.contactList = contactList;
	}
	
	@Override
	public String toString() {
		
		Contact contact;
		
		String classroom = "";
		
		Iterator<Contact> iter = contactList.iterator();
		
		while (iter.hasNext()) {
			
			contact = iter.next();
			
			classroom += contact.toString();
			
		}
		
		return classroom; 
		
	}
	
	public void addContact(Contact contact) {
		
		
		boolean done = false;
		
		Contact contactTemp;
		
		Iterator<Contact> iter = contactList.iterator();
		
		while (iter.hasNext() && !done) {
			
			contactTemp = iter.next();
			
			if (contactTemp.compareTo(contact) > 0) {
				
				int position = contactList.indexOf(contactTemp);
				
				contactList.add(position, contact);
				
				done = true;
				
			}
			
		}
		
		if(!done) {
			
			contactList.add(contact);
			
		}
		
	}
	
	public Contact getContact(int i) {
		
		Contact contact = contactList.get(i);
		
		return contact;
		
	}
	
	public boolean removeContact(int i) {
		
		boolean done = false;
		
		if (i >= 0 && contactList.size() > i) {
			
			contactList.remove(i);
			
			done = true;
			
		}
		
		else {
			
			System.out.println("Contatto non presente in Rubrica\n");
			
		}
		
		return done;
		
	}
	
	public List shuffleRubric() {
		
		List<Contact> newList = new ArrayList<>();
				
		newList.addAll(contactList);
		
		Collections.shuffle(newList);
		
		return newList;
		
	}

}