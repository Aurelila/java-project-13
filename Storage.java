//Nancy McCoy  2242343

package mccoy13;

public class Storage extends Furniture {
	//Data members
	private String storeData;
	private boolean electricPower;
	
	//Constructor
	public Storage(String item, double price, String storeData, boolean electricPower) {
		super(item, price);
		this.storeData = storeData;
		this.electricPower = electricPower;
	}

	
	public String toString() {
		return super.toString() + "" + storeData + " " + "Powered:" + electricPower;
				
		
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



	

