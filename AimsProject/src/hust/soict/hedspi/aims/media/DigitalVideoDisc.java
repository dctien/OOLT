	package hust.soict.hedspi.aims.media;

public class DigitalVideoDisc extends Disc{
	// Constructor by title
	public DigitalVideoDisc(String id, String title, int length, float cost) {
		super(id, title, length, cost);
	}

	public DigitalVideoDisc(String id, String title, String category, int length, float cost) {
		super(id, title, category, length, cost);
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
