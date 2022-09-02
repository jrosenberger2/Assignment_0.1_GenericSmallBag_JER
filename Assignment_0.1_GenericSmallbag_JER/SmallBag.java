/**
 * SmallBag.java serves as an intro to the Bag ADT and review of Generics
 * @author Jared Rosenberger
 * @version 9/1/22
 * SmallBag.java
 * Fall 2022
 */
public class SmallBag<T> {
	//Instance Variables
	private T item; //item is used as a stand in for any Item object inside of the bag
	
	//Accessors and Mutators
	/**
	 * 
	 * @return the current value of Item
	 */
	public T getItem() {
		return item;
	}//end getItem()
	
	/**
	 * 
	 * @param thing the value of item as passed into setItem()
	 */
	public void setItem(T thing) {
		item = thing;
	}//end setItem()
}//end SmallBag.java