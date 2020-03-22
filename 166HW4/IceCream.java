/**
 * IceCream, an extended class from class IceCream
 * @param String newTypeOfIceCream is the name of merchandise
 * @param int newHowMuchPerServing is the unit price of ice cream
 * @author Jimmy K, Edmund S.
 */
public class IceCream extends DessertItem{
protected String typeOfIceCream; 
private int howMuchPerServing;

public IceCream(String newTypeOfIceCream, int newHowMuchPerServing) {
	this.typeOfIceCream = newTypeOfIceCream; 
	this.howMuchPerServing = newHowMuchPerServing; 
}

public int getCost(){
	return this.howMuchPerServing; 
}

public String getTypeOfIceCream(){
	return this.typeOfIceCream; 
}

public int getHowMuchPerServing() {
	return this.howMuchPerServing;
}

public void setHowMuchPerServing(int howMuchPerServing) {
	this.howMuchPerServing = howMuchPerServing;
}

public void setTypeOfIceCream(String typeOfIceCream) {
	this.typeOfIceCream = typeOfIceCream;
}

public IceCream() {
	
}

public String toString() {
	return String.format("%1$-" + DessertShoppe.MAX_ITEM_NAME_SIZE + "s"+ "%2$"
			+ DessertShoppe.COST_WIDTH + "s", this.typeOfIceCream, DessertShoppe.cents2dollarsAndCents(this.getCost()));
}

public static void main(String[] args) {
	DessertItem iceCream1 = new IceCream("Strawberry Ice Cream",145); 
	System.out.println(iceCream1.toString());
}
}
