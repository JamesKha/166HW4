import java.util.ArrayList;
import java.util.List;


public class Checkout {
	// the list!!
	private List<DessertItem> checkoutList;
	
	// constructor
	public Checkout() {
		checkoutList = new ArrayList<DessertItem>();
	}
	
	// numberOfItems method
	
	// check why it is not a for loop of the DessertItem elements?
	public int numberOfItems() {
		return checkoutList.size();
	}
	
	// enterItem method
	public void enterItem(DessertItem item) {
		checkoutList.add(item);
	}
	
	// clear method
	public void clear() {
		checkoutList.clear();
	}
	
	// totalCost method
	/* Caution! note that when you retrieve an element 
	 * from the list, you will be retrieving an Object 
	 * thus an explicit cast is needed 
	 */
	
	//!!!UNFAMILIAR CONCEPT! TEST REQUIRED!!!
	public int totalCost() {
		int total = 0;
//		Iterator iterator = checkoutList.iterator();
//		while (iterator.hasNext()) {
//			total += iterator.next().getCost();
//		}
		
//		for(int i = 0; i < checkoutList.size(); i++) {
//			total += ((DessertItem) checkoutList).getCost(); 
//		}
//		
		for(DessertItem item : checkoutList) {
			total += item.getCost();
		}
		return total;		// without tax
	}
	
	// totalTax method 
	// tax rate is converted from double to integer
	// using Math.round() type casting
	public int totalTax() {
		int totalTax = totalCost() * (int) Math.round(DessertShoppe.TAX_RATE);
		return totalTax;	// in cents
	}
	
	// toString method
	public String toString() {
		String s = "\t" + DessertShoppe.STORE_NAME + "\n"
				 + "\t--------------------\n\n";
		for(DessertItem item : checkoutList) {
			s += item.toString()+"\n";
		}
		return s + "\n" 		
				
					// Tax row
			+ String.format("%1$-" + DessertShoppe.MAX_ITEM_NAME_SIZE + "s"+ "%2$"
			+ DessertShoppe.COST_WIDTH + "s", "Tax", DessertShoppe.cents2dollarsAndCents(this.totalTax()))
				
			+ '\n' //Total Cost row 
			+ String.format("%1$-" + DessertShoppe.MAX_ITEM_NAME_SIZE + "s"+ "%2$"
			+ DessertShoppe.COST_WIDTH + "s", "Total Cost", 
			DessertShoppe.cents2dollarsAndCents(this.totalCost() + this.totalTax()));
	}
}
