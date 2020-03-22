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


public Cookie(String newTypeOfCookie, int newNumberOfCookies, int newCostPerCookieDozen) {
this.typeOfCookie = newTypeOfCookie; 
this.numberOfCookies = newNumberOfCookies;
this.costPerCookieDozen = newCostPerCookieDozen;
}
public int getCost(){
	int perEachCookie = costPerCookieDozen/12; 
	return perEachCookie* numberOfCookies; 
}

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

