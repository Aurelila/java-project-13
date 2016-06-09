//Nancy McCoy 2242343

package mccoy13;

//Variables
public abstract class Furniture implements Comparable<Furniture>  {
	String item;
	double price;
	
//Constructor	
public Furniture(String item, double price) {
	this.item = item;
	this.price = price;
	
}

public double getPrice() {
	return this.price;  //Gets price of furniture
}

public String toString() {
	return "Furniture item: " + item + " " + "price: $" + price + " ";
	
}


public abstract String returnPurpose();






}
