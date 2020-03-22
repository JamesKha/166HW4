import java.util.ArrayList;

/**
 * Checkout a class used to handle checkout activity
 * @author Jimmy K, Edmund S.
 */


public class Checkout {
	// the list!!
	ArrayList<DessertItem> checkoutList = new ArrayList<DessertItem>();  
	void enterItem(DessertItem item){
		checkoutList.add(item);
	}
	public int numberOfItems(){
		return checkoutList.size(); 
	}
	public int totalCost() { 
		int sum = 0; 
		for (int index = 0; index < checkoutList.size(); index++) {
			sum += checkoutList.get(index).getCost();
		}
		return sum; 
	}
	public int totalTax() {
		int totalTax = (int) Math.round((totalCost() * (DessertShoppe.TAX_RATE/100)));
		return totalTax;
	}
	public void clear() {
		checkoutList.clear();
	}
	
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
