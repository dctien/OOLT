
public class Order {
	public static final int MAX_NUMBER_ORDERED =10;
	
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
	public int qtyOrdered = 0;
	
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
	
}
