/**
 * IceCream, an extended class from class IceCream
 * @param String newTypeOfIceCream is the name of merchandise
 * @param int newHowMuchPerServing is the unit price of ice cream
 * @author Jimmy K, Edmund S.
 */
public class IceCream extends DessertItem{
protected String typeOfIceCream; 
private int howMuchPerServing;

/**
 * @param newTypeOfIceCream
 * @param newHowMuchPerServing
 */
public IceCream(String newTypeOfIceCream, int newHowMuchPerServing) {
	this.typeOfIceCream = newTypeOfIceCream; 
	this.howMuchPerServing = newHowMuchPerServing; 
}

/**
 *@return the unit price of ice cream 
 */
public int getCost(){
	return this.howMuchPerServing; 
}

/**
 * @return the type of ice cream 
 */
public String getTypeOfIceCream(){
	return this.typeOfIceCream; 
}

/**
 * @return the unit price of ice cream
 */
public int getHowMuchPerServing() {
	return this.howMuchPerServing;
}

/**
 * In order to set up the object within the sundae class, this setter is needed 
 * @param howMuchPerServing 
 */
public void setHowMuchPerServing(int howMuchPerServing) {
	this.howMuchPerServing = howMuchPerServing;
}

/**
 * In order to set up the object within the sundae class, this setter is needed 
 * @param typeOfIceCream
 */
public void setTypeOfIceCream(String typeOfIceCream) {
	this.typeOfIceCream = typeOfIceCream;
}

/**
 * A constructor in order for the sundae class to work 
 */
public IceCream() {
	
}

/**
 * Creates a string format depending on the parameters listed that are specific to the ice cream: typeOfIceCream,   howMuchPerServing
 *@return a string that includes the parameters and the due cost of the .getCost
 */
public String toString() {
	return String.format("%1$-" + DessertShoppe.MAX_ITEM_NAME_SIZE + "s"+ "%2$"
			+ DessertShoppe.COST_WIDTH + "s", this.typeOfIceCream, DessertShoppe.cents2dollarsAndCents(this.getCost()));
}
	
/**
 * @param args
 */
//simple test main class
public static void main(String[] args) {
	DessertItem iceCream1 = new IceCream("Strawberry Ice Cream",145); 
	System.out.println(iceCream1.toString());
}
}
