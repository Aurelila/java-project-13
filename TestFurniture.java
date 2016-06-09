//Nancy McCoy  2242343

package mccoy13;

import java.util.Arrays;

public class TestFurniture {
	
	public static void main(String[] args) {
		//Furniture objects
		Furniture furn1 = new Seating("recliner", 1200.0, 1);
		Furniture furn2 = new Seating("love seat", 850.0, 2);
		Furniture furn3 = new Seating("sofa", 3000.0, 3);
		Furniture furn4 = new Storage("refigerator", 1400.0, "Used to store food", true);
		Furniture furn5 = new Storage("dresser", 650.0, "Used to store clothing", false);
		Furniture furn6 = new Storage("stool", 100.0 , "Used for sitting", false);
		
			
		//Holds furniture in array
		Object array[] = {furn1, furn2, furn3, furn4, furn5, furn6};
		System.out.println("Before ordering by price");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        Arrays.sort(array);
        System.out.println("After ordering by price");
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j]);
        }
}
}

