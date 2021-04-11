package hust.soict.hedspi.aims;
import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import hust.soict.hedspi.aims.order.Order;

public class Aims {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Init object order
		Order anOrder = Order.createdOrder();
		
//		Create a new dvd object and set the fields
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
		dvd1.setCategory("Animation");
		dvd1.setCost(19.95f);
		dvd1.setDirector("Roger Allers");
		dvd1.setLength(87);
//		add the dvd to the order
		anOrder.addDigitalVideoDisc(dvd1);
	
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars");
		dvd2.setCategory("Science Fiction");
		dvd2.setCost(24.95f);
		dvd2.setDirector("George Lucas");
		dvd2.setLength(124);
		anOrder.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin");
		dvd3.setCategory("Animation");
		dvd3.setCost(18.99f);
		dvd3.setDirector("John Musker");
		dvd3.setLength(90);
		anOrder.addDigitalVideoDisc(dvd3);

//		remove dvd to the order
//		anOrder.removeDigitalVideoDisc(dvd1);
		
		// dvd4
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("test1", "test1", "author 1", 123, 15.5f);
		
		// dvd5
		DigitalVideoDisc dvd5 = new DigitalVideoDisc("test2", "test2", "author 2", 80, 19.5f);
		
		DigitalVideoDisc [] lisDisc = {dvd1, dvd2, dvd3};
		
		anOrder.addDigitalVideoDisc(lisDisc);
		// Show items in anOrder
		anOrder.printListOfOrdered();
		
		Order order2 = Order.createdOrder();
		order2.addDigitalVideoDisc(dvd1, dvd3, dvd5);
		order2.printListOfOrdered();
		
		Order order3 = Order.createdOrder();
		order3.addDigitalVideoDisc(dvd1, dvd5, dvd2, dvd4);
		order3.printListOfOrdered();
		
		Order order4 = Order.createdOrder();
		order4.addDigitalVideoDisc(dvd1, dvd3);
		order4.printListOfOrdered();
	}

}
