package hust.soict.hedspi.aims.media;

public class DigitalVideoDisc extends Media{
	private String director;
	private int length;
	
//	Getters and Setters
	
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	
	
//	Constructors
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
	}
	public DigitalVideoDisc(String title, String category) {
		super();
		this.title = title;
		this.category = category;
	}
	public DigitalVideoDisc(String title, String category, String director) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
	}
	public boolean search(String title) { 
		String[] inputSearch = title.toLowerCase().split(" ");
		for (int i=0 ; i < inputSearch.length ; i++) {
			if(getTitle().toLowerCase().contains(inputSearch[i])) {
				return true;
			}
		}
		return false;
	}
}
