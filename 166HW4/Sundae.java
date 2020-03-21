
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
	return (this.getCost() + this.costOfTopping); 
}

public String getTypeOfIceCream() {
	return typeOfIceCream; 
}


 public String toString() { 
	 return this.typeOfTopping + " Sundae with " + exampleSundae.getTypeOfIceCream(); 
	 }
	 
