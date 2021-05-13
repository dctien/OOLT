package hust.soict.hedspi.aims.media.disc;

import hust.soict.hedspi.aims.media.Media;

public class DigitalVideoDisc extends Disc implements Playable{
	// Constructor by title
	public DigitalVideoDisc(String id, String title, int length, float cost) {
		super(id, title, length, cost);
	}

	public DigitalVideoDisc(String id, String title, String category, int length, float cost) {
		super(id, title, category, length, cost);
	}
	
	public DigitalVideoDisc(String id, String title, String category, int length, String director, float cost) {
		super(id, title, category, length, director, cost);
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
	
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}
	
	public int compareTo(Media media) {
		if(media instanceof DigitalVideoDisc) {
			if(this.getCost() < media.getCost())
				return -1;
			else if(this.getCost() == media.getCost())
				return 0;
			else return 1;
		}else {
			return super.compareTo(media);
		}
	}
}