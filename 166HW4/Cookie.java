/**
 * Cookie, an extended class from Abstract class DessertItem
 * @param String newTypeOfCookie is the name of merchandise
 * @param int newNumberOfCookies records number of purchase
 * @param int newCostPerCookieDozen is the unit price per dz.
 * @author Jimmy K., Edmund S.
 */
public class Cookie extends DessertItem{
private String typeOfCookie; 
private int numberOfCookies; 
private int costPerCookieDozen; 

/**
 * @param newTypeOfCookie
 * @param newNumberOfCookies
 * @param newCostPerCookieDozen
 */
public Cookie(String newTypeOfCookie, int newNumberOfCookies, int newCostPerCookieDozen) {
this.typeOfCookie = newTypeOfCookie; 
this.numberOfCookies = newNumberOfCookies;
this.costPerCookieDozen = newCostPerCookieDozen;
}
/**
 *takes the amount for a dozen cookies listed within the parameter of the constructor and calculating how much is a single cookie
 *@return the cost with the amount cookies needed adjusted to the single cookie price 
 */
public int getCost(){
	int perEachCookie = costPerCookieDozen/12; 
	return perEachCookie* numberOfCookies; 
}

/**
 * Creates a string format depending on the parameters listed that are specific to the cookies: typeOfCookie, numberOfCookies, costPerCookieDozen
 *@return a string that includes the parameters and the due cost of the .getCost
 */
public String toString() {
	return this.numberOfCookies + " @ " + (double) this.costPerCookieDozen / (double) 100 + "/dz.\n" 
			+ String.format("%1$-" + DessertShoppe.MAX_ITEM_NAME_SIZE + "s"+ "%2$"
			+ DessertShoppe.COST_WIDTH + "s", this.typeOfCookie, DessertShoppe.cents2dollarsAndCents(this.getCost()));
}
//simple test main class
public static void main(String[] args) {
	DessertItem cookie1 = new Cookie("Chocolate Chip Cookies", 4, 399); 
	System.out.println(cookie1.toString());
}
}
