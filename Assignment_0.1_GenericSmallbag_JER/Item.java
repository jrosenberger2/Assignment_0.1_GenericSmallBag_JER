/**
 * Item.java is a simplistic implementation of the Item ADT
 * @author Jared Rosenberger
 * @version 9/1/22
 * Item.java
 * Fall 2022
 */
public class Item<T> {
	//Instance variables
	private T e; //e is a data field of an unspecified type for the Item ADT 
	
	//Accessors and Mutators
	/**
	 * 
	 * @return the current value of e
	 */
	public T getE() {
		return e;
	}//end getE()
	
	/**
	 * 
	 * @param value the value of e as passed into this method
	 */
	public void setE(T value) {
		e = value;
	}//end setE()
}//end Item.java