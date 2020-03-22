import java.util.ArrayList;

/**
 * Checkout a class used to handle checkout activity
 * @author Jimmy K, Edmund S.
 * @param  DessertItem item 
 */

public class Checkout {
	// the list!!
	ArrayList<DessertItem> checkoutList = new ArrayList<DessertItem>();  
	 void enterItem(DessertItem item){
		checkoutList.add(item);
	}
	 
	 
	/**
	 * This counts how many items are in the Desert Item Array List 
	 * @return the number of items within the list  
	 */
	public int numberOfItems(){
		return checkoutList.size(); 
	}
	
	/**
	 * Retrieves the amount due from the items' getCost() method and adds them up 
	 * @return a final cost from all of the items 
	 */
	public int totalCost() { 
		int sum = 0; 
		for (int index = 0; index < checkoutList.size(); index++) {
			sum += checkoutList.get(index).getCost();
		}
		return sum; 
	}
	
	/**
	 * takes the amount of of the total cost of the array list and multiplying against the tax rate of the DessertShoppe class 
	 * @return the tax amount 
	 */
	public int totalTax() {
		int totalTax = (int) Math.round((totalCost() * (DessertShoppe.TAX_RATE/100)));
		return totalTax;
	}
	public void clear() {
		checkoutList.clear();
	}
	
	/**
	 * Creates a "receipt" format string, that takes the values from totalCost(),  totalTax(), and numberofItems() with spacing
	 * listed in the DessertShoppe class 
	 * @return a string that is formatted from the values collected from the entirety of the objects 
	 */
	public String toString() {
		/* prints the shop name */
		String s = "\t" + DessertShoppe.STORE_NAME + "\n"
				 + "\t--------------------\n\n";
		
		/* for every item in the CheckoutList, append to s with a new line */
		for(DessertItem item : checkoutList) {
			s += item.toString()+"\n";
		}
		return s + "\n" 		
				
					// Tax
			+ String.format("%1$-" + DessertShoppe.MAX_ITEM_NAME_SIZE + "s"+ "%2$"
			+ DessertShoppe.COST_WIDTH + "s", "Tax", DessertShoppe.cents2dollarsAndCents(this.totalTax()))
				
			+ '\n' //Total Cost
			+ String.format("%1$-" + DessertShoppe.MAX_ITEM_NAME_SIZE + "s"+ "%2$"
			+ DessertShoppe.COST_WIDTH + "s", "Total Cost", 
			DessertShoppe.cents2dollarsAndCents(this.totalCost() + this.totalTax()));
	}
