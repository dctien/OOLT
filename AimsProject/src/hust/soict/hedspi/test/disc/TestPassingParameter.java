package hust.soict.hedspi.test.disc;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;

public class TestPassingParameter {

	public static void main(String[] args) {
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("a123", "Jungle", 123, 10f);
		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("a124", "Cinderella", 124, 12.3f);
		
		swap(jungleDVD, cinderellaDVD);
		System.out.println("jungle dvd title: "+ jungleDVD.getTitle());
		System.out.println("cinderella dvd title: "+ cinderellaDVD.getTitle());
		
		changeTitle(jungleDVD, cinderellaDVD.getTitle());
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
	}
	
	public static void swap(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		String temp = dvd1.getTitle();
		dvd1.setTitle(dvd2.getTitle());
		dvd2.setTitle(temp);
	}
	
	public static void changeTitle(DigitalVideoDisc dvd, String title) {
		String oldTitle = dvd.getTitle();
		dvd.setTitle(title);
//		dvd = new DigitalVideoDisc(oldTitle);
	}
}
