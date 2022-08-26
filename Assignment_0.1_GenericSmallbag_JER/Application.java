/*
 * @author Jared E. Rosenberger
 * 8/25/22
 * Application.java
 */
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item<String> item1 = new Item<String>();
		item1.setE("Jared E. Rosenberger");
		Item<Integer> item2 = new Item<Integer>();
		item2.setE(7);
		SmallBag<Item> bag = new SmallBag<Item>();
		bag.setItem(item1);
		System.out.println(bag.getItem().getE());
		bag.setItem(item2);
		System.out.println(bag.getItem().getE());
	}//main
}//Application.java