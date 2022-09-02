/**
 * Application.java tests the methods of Item.java and SmallBag.java to ensure the generics work properly
 * @author Jared Rosenberger
 * @version 9/1/22
 * Application.java
 * Fall 2022
 */
public class Application {

	public static void main(String[] args) {
		Item<String> item1 = new Item<String>();
		item1.setE("Jared E. Rosenberger");
		Item<Integer> item2 = new Item<Integer>();
		item2.setE(7);
		SmallBag<Item> bag = new SmallBag<Item>();
		bag.setItem(item1);
		System.out.println(bag.getItem().getE());
		bag.setItem(item2);
		System.out.println(bag.getItem().getE());
	}//end main()
}//end Application.java