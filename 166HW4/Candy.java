/**
 * Candy, an extended class from Abstract class DessertItem
 * @param String typeOfcandy is the name of merchandise
 * @param double howManyPounds recording weight of purchase
 * @param int newPricePerPound is the unit price
 * @author Jimmy K., Edmund S.
 */
public class Candy extends DessertItem{
	private String typeOfCandy; 
	private double howManyPounds;
	private int pricePerPound; 
	
		/**
	 * @param newTypeOfCandy
	 * @param howManyPounds
	 * @param newPricePerPound
	 */
	
	public Candy(String newTypeOfCandy, double howManyPounds, int newPricePerPound){
		this.typeOfCandy = newTypeOfCandy; 
		this.howManyPounds = howManyPounds; 
		this.pricePerPound = newPricePerPound; 
	}
	/**
	 * Retrieves the price of the candy, depending on how much the customer needs
	 *@return the cost amount owed 
	 */
		
	public int getCost(){
		return (int) Math.round(pricePerPound* howManyPounds); 
	}
/**
 * Creates a string format depending on the parameters listed that are specific to the candy: typeOfCandy, howManyPounds, pricePerPound
 *@return a string that includes the parameters and the due cost of the .getCost() method 
 */
	
public String toString() {
	return this.howManyPounds + " lbs. @ " + (double) this.pricePerPound / (double) 100 + "/lb.\n" 
			+ String.format("%1$-" + DessertShoppe.MAX_ITEM_NAME_SIZE + "s"+ "%2$"
			+ DessertShoppe.COST_WIDTH + "s", this.typeOfCandy, DessertShoppe.cents2dollarsAndCents(this.getCost()));
	}

/**
 * @param args
 */
//simple test main class
public static void main(String[] args) {
	DessertItem candy1 = new Candy("fudge", 2.30, 89);
	System.out.println(candy1.toString());
	}

}


