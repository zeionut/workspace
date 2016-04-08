package it.engim.esAstrac;

public class Book implements Marketable, Discount{
	
	private String title;
	private int size;
	
	public Book() {
		
		this.title = "";
		this.size = 0;
		
	}
	
	public Book(String title, int size) {
		
		this.title = title;
		this.size = size;
		
	}

	public String getTitle() {
		
		return title;
		
	}

	public void setTitle(String title) {
		
		this.title = title;
		
	}

	public int getSize() {
		
		return size;
		
	}

	public void setSize(int size) {
		
		this.size = size;
		
	}
	
	@Override
	public String toString() {
		
		return "title " + this.title + " size " + this.size;
		
	}
	
	@Override
	public int getPrice() {
		
		return 10;
		
	}

	@Override
	public int discounted(int num) {
		
		int dis = (getPrice() * num) / 100;
		
		return dis;
	}

	@Override
	public int compareTo(Object o) {
		
	    int comapre = ((getPrice() > ((Marketable) o).getPrice()) ? 1 : (getPrice() < ((Marketable) o).getPrice()) ? -1 : 0);
					
		return comapre;
		
	}

}
