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
IceCream exampleSundae = new IceCream(); 


public Sundae(String newTypeOfIceCream, int newcostOfIceCream, String newTypeOfTopping,  int newCostOfTopping) {
	exampleSundae.setTypeOfIceCream(newTypeOfIceCream);
	exampleSundae.setHowMuchPerServing(newcostOfIceCream);
	this.typeOfTopping = newTypeOfTopping; 
	this.costOfTopping = newCostOfTopping; 
}
public int getCost(){
	return (exampleSundae.getHowMuchPerServing() + this.costOfTopping); 
}

public String getTypeOfIceCream() {
	return typeOfIceCream; 
}


 public String toString() { 
	 return this.typeOfTopping + " Sundae with\n" + String.format("%1$-" + DessertShoppe.MAX_ITEM_NAME_SIZE + "s"+ "%2$"
			+ DessertShoppe.COST_WIDTH + "s", exampleSundae.getTypeOfIceCream(), DessertShoppe.cents2dollarsAndCents(this.getCost()));
	 }
	 

// simple test main class
public static void main(String[] args) {
	DessertItem iceCream1 = new Sundae("Choc. Chip Ice Cream",145, "Hot Fudge", 50);
	System.out.println(iceCream1.toString());
	DessertItem iceCream2 = (new Sundae("Vanilla Ice Cream",105, "Caramel", 50));
	System.out.println(iceCream2.toString());
}
}

