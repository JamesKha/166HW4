/**
 * Sundae, an extended class from class IceCream
 * @param String newTypeOfIceCream is the name of merchandise
 * @param int newcostOfIceCream is the unit price of ice cream
 * @param String newTypeOfTopping is the name of topping
 * @param int newCostOfTopping records cost of topping 
 * @author Jimmy K, Edmund S.
 */
public class Sundae extends IceCream{
private String typeOfTopping;
private int costOfTopping; 

/**
 * Initializes a new iceCream class every time a Sundae class is needed 
 */
IceCream exampleSundae = new IceCream(); 


/**
 * @param newTypeOfIceCream
 * @param newTypeOfIceCream
 * @param newTypeOfTopping
 * @param newCostOfTopping
 * 
 * Creates a Sundae class by using the initialized ice cream class and setting the first and second values as the iceCream class.
 * It, then, takes the third and fourth values as the topping name and the cost. 
 */

public Sundae(String newTypeOfIceCream, int newcostOfIceCream, String newTypeOfTopping,  int newCostOfTopping) {
	exampleSundae.setTypeOfIceCream(newTypeOfIceCream);
	exampleSundae.setHowMuchPerServing(newcostOfIceCream);
	this.typeOfTopping = newTypeOfTopping; 
	this.costOfTopping = newCostOfTopping; 
}

/**
 *takes the cost of the iceCream class and the topping and adds them together
 *@return the cost of both the ice cream serving and the topping 
 */
public int getCost(){
	return (exampleSundae.getHowMuchPerServing() + this.costOfTopping); 
}


/**
 *returns the type of ice cream within the sundae class 
 */
public String getTypeOfIceCream() {
	return typeOfIceCream; 
}

/**
 * Creates a string format depending on the parameters listed that are specific to the Sundae: newTypeOfIceCream, newTypeOfTopping 
 *@return a string that includes the parameters and the due cost of the .getCost
 */

 public String toString() { 
	 return this.typeOfTopping + " Sundae with\n" + String.format("%1$-" + DessertShoppe.MAX_ITEM_NAME_SIZE + "s"+ "%2$"
			+ DessertShoppe.COST_WIDTH + "s", exampleSundae.getTypeOfIceCream(), DessertShoppe.cents2dollarsAndCents(this.getCost()));
	 }
	 

// simple test main class
/**
 * @param args
 */
public static void main(String[] args) {
	DessertItem iceCream1 = new Sundae("Choc. Chip Ice Cream",145, "Hot Fudge", 50);
	System.out.println(iceCream1.toString());
	DessertItem iceCream2 = (new Sundae("Vanilla Ice Cream",105, "Caramel", 50));
	System.out.println(iceCream2.toString());
}
}
