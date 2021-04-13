package hust.soict.hedspi.aims.order;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.utils.MyDate;
import java.util.ArrayList;

public class Order {
	public static final int MAX_NUMBER_ORDERED =10;
	public static final int MAX_LIMITTED_ORDERS = 5;
	private static int nbOrders = 0;
	
	private MyDate dateOrdered = new MyDate();
	
	public ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	
	public MyDate getDateOrdered() {
		return dateOrdered;
	}

	private Order() {
		nbOrders++;
	}
	
	// call constructor 
	public static Order createdOrder() {
		if(nbOrders < MAX_LIMITTED_ORDERS) {
			Order objOrder = new Order();
			return objOrder;
		}else {
			System.err.println("The limitted orders is almost full!");
			return null;
		}
	}
	
//	public int getQtyOrdered() {
//		return qtyOrdered;
//	}

	public void addMedia(Media media) {
		if(itemsOrdered.contains(media)) {
			System.out.println("The media with title: " + media.getTitle() + " is existed!");
		}else {
			itemsOrdered.add(media);
			System.out.println("The media with title: " + media.getTitle() + " has been added");
		}
	}
	public void addMedia(Media... mediaList) {
		for(int i = 0; i < mediaList.length; i++) {
			addMedia(mediaList[i]);
		}
	}
	public void removeMedia(Media media) {
		if(itemsOrdered.contains(media)) {
			itemsOrdered.remove(media);
		}else {
			System.out.println("Can't not find!");
		}
	}
	
	
	public Media getALuckyItem() {
		double rand = Math.random();
		rand *= itemsOrdered.size();
		int item = (int)rand;
		itemsOrdered.get(item).setCost(0.0f);
		return itemsOrdered.get(item);
	}
	
	public float totalCost() {
		float money = 0.0f;
		for (int i=0 ; i < itemsOrdered.size() ; i++) {
			money += itemsOrdered.get(i).getCost();
		}
		return money;
	}
	
//	public void printListOfOrdered() {
//		System.out.println("********************************ORDER******************************");
//		dateOrdered.print();
//		int i = 1;
//		for(Media media: itemsOrdered) {
//			System.out.println(i + ". Media - " + media.getId() + " - " + media.getTitle() + " - " + media.getCategory() +  ": " + media.getCost() + "$");
//			i++;
//		}
//		System.out.println("Total cost: " + totalCost());
//		System.out.println("*******************************************************************");
//	}

}
