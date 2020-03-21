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
	return howMuchPerServing;
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
	return this.typeOfIceCream; 
}
}
