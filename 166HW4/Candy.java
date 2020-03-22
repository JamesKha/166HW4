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
	
	public Candy(String newTypeOfCandy, double howManyPounds, int newPricePerPound){
		this.typeOfCandy = newTypeOfCandy; 
		this.howManyPounds = howManyPounds; 
		this.pricePerPound = newPricePerPound; 
	}
	public int getCost(){
		return (int) Math.round(pricePerPound* howManyPounds); 
	}

public String toString() {
	return this.howManyPounds + " lbs. @ " + (double) this.pricePerPound / (double) 100 + "/lb.\n" 
			+ String.format("%1$-" + DessertShoppe.MAX_ITEM_NAME_SIZE + "s"+ "%2$"
			+ DessertShoppe.COST_WIDTH + "s", this.typeOfCandy, DessertShoppe.cents2dollarsAndCents(this.getCost()));
	}


//simple test main class
public static void main(String[] args) {
	DessertItem candy1 = new Candy("fudge", 2.30, 89);
	System.out.println(candy1.toString());
	}

}


