
public class cookie extends DessertItem{
private String typeOfCookie; 
private int numberOfCookies; 
private int costPerCookieDozen; 


public cookie(String newTypeOfCookie, int newNumberOfCookies, int newCostPerCookieDozen) {
this.typeOfCookie = newTypeOfCookie; 
this.numberOfCookies = newNumberOfCookies;
this.costPerCookieDozen = newCostPerCookieDozen;
}
public int getCost(){
	int perEachCookie = costPerCookieDozen/12; 
	return perEachCookie* numberOfCookies; 
}

public String toString() {
	return this.numberOfCookies + " @ " + this.costPerCookieDozen+ "/dz\n" + this.typeOfCookie + " " + this.getCost(); 
}

public static void main(String[] args) {
	DessertItem cookie1 = new cookie("Chocolate Chip Cookies", 4, 399); 
	System.out.println(cookie1.toString());
}
}

