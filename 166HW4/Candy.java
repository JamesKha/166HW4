
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
	return this.howManyPounds + " @ " + this.pricePerPound+ "/dz\n" + this.typeOfCandy + " " + this.getCost(); 
	}



public static void main(String[] args) {
	DessertItem candy1 = new Candy("fudge", 2.30, 89); 
	System.out.println(candy1.toString());
	}

}


