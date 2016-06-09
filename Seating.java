//Nancy McCoy 2242343

package mccoy13;

public class Seating extends Furniture {
	//Data members
	private int seatNum;
	
	//Constructor
	public Seating(String item, double price, int seatNum) {
		super(item, price);
		this.seatNum = seatNum;
	}

	
	public String toString() {
		return super.toString() + "seating capacity:" + seatNum + " ";
	}


	@Override
	public int compareTo(Furniture comparePrice ) {
		int compareFurn = (int) ((Furniture) comparePrice).getPrice();
		
		return (int) (this.price - compareFurn);
	}
	@Override    	
	public String returnPurpose() {
        // TODO Auto-generated method stub
        return null;
    }
	


}

