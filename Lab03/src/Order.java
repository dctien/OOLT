
public class Order {
	public static final int MAX_NUMBER_ORDERED =10;
	public static final int MAX_LIMITTED_ORDERS = 5;
	private static int nbOrders = 0;
	
	private MyDate dateOrdered = new MyDate();
	
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
	public int qtyOrdered = 0;
	
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
	
	public int getQtyOrdered() {
		return qtyOrdered;
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered < MAX_NUMBER_ORDERED) {
			itemsOrdered[qtyOrdered] = disc;
			qtyOrdered++;
			System.out.println("The disc with title: " + disc.getTitle()+" has been added.");	
		}else {
			System.out.println("The order is already full");
		}
	}
	
	// method add with arbitrary number of argument
	public void addDigitalVideoDisc(DigitalVideoDisc... dvdList){
		for(int i = 0; i < dvdList.length ; i++) {
			addDigitalVideoDisc(dvdList[i]);
		}
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		addDigitalVideoDisc(dvd1);
		addDigitalVideoDisc(dvd2);
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		int c,i;
		if(qtyOrdered==0)
			System.out.println("Empty order");
		else{
			for (c = i = 0; i < qtyOrdered; i++) {
				if(itemsOrdered[i] != disc) {
					itemsOrdered[c] = itemsOrdered[i];
					c++;
				}
			}
			if(c == i) {
				System.out.println("Can't find disc with title: " + disc.getTitle() + " of ordered");
			}else {
				System.out.println("The disc with titile: " + disc.getTitle() + " has been removed");
				qtyOrdered--;
			}
		}
	}
	
	public float totalCost() {
		float money = 0.0f;
		for (int i=0 ; i < qtyOrdered ; i++) {
			money += itemsOrdered[i].getCost();
		}
		return money;
	}
	
	public void printListOfOrdered() {
		System.out.println("********************************ORDER " + nbOrders + "******************************");
		dateOrdered.print();
		for(int i = 0; i < qtyOrdered; i++) {
			System.out.println(i+1 + ". DVD - " + itemsOrdered[i].getTitle() + " - " + itemsOrdered[i].getCategory() + " - " + itemsOrdered[i].getDirector() + " - " + itemsOrdered[i].getLength() + ": " + itemsOrdered[i].getCost() + "$");
		}
		System.out.println("Total cost: " + totalCost());
		System.out.println("*******************************************************************");
	}
}
