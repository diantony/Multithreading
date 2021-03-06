package com;

/**
 * A Machine is used to make a particular Food.  Each Machine makes
 * just one kind of Food.  Each machine has a capacity: it can make
 * that many food items in parallel; if the machine is asked to
 * produce a food item beyond its capacity, the requester blocks.
 * Each food item takes at least item.cookTimeMS milliseconds to
 * produce.
 */

/**
 * 
 * @author Niranjhani
 *
 *	@Invariant 
 *		1) Fries are cooked in 350ms by Machine Burner
 *		2) Hamburger are cooked in 500ms by Machine Grill
 *		3) Coffee are cooked in 100ms by Machine Braun
 */
public class Machine {
	public final String machineName;
	public final Food machineFoodType;
	//Create a new list listOfFood

	//YOUR CODE GOES HERE...


	/**
	 * The constructor takes at least the name of the machine,
	 * the Food item it makes, and its capacity.  You may extend
	 * it with other arguments, if you wish.  Notice that the
	 * constructor currently does nothing with the capacity; you
	 * must add code to make use of this field (and do whatever
	 * initialization etc. you need).
	 */
	
	
	/*
	 * @PreCondition - nameIn,foodIn is not null and capacityIn is greater than 0
	 * 
	 * 
	 */
	public Machine(String nameIn, Food foodIn, int capacityIn) {
		this.machineName = nameIn;
		this.machineFoodType = foodIn;
		// initialize the listOfFood
		//YOUR CODE GOES HERE...

	}
	

	

	/**
	 * This method is called by a Cook in order to make the Machine's
	 * food item.  You can extend this method however you like, e.g.,
	 * you can have it take extra parameters or return something other
	 * than Object.  It should block if the machine is currently at full
	 * capacity.  If not, the method should return, so the Cook making
	 * the call can proceed.  You will need to implement some means to
	 * notify the calling Cook when the food item is finished.
	 */
	
	public Object makeFood() throws InterruptedException {
		//YOUR CODE GOES HERE...
		/*
		 * add the food to the list and initiate the thread to cookAnItem
		 * 
		 
		 * 
		 */
		
	}
	
	

	/** @PreCondition - food is present in foodList
	 * @PostCondition - food is cooked and notified to the cook
	 * @Exception - 1) Null pointer exception if the food is not present
	 * 			    2) InterruptedException is the thread is interrupted
	 */
	//THIS MIGHT BE A USEFUL METHOD TO HAVE AND USE BUT IS JUST ONE IDEA
	private class CookAnItem implements Runnable {
		public void run() {
			try {
				//YOUR CODE GOES HERE...
				/*
				 * Make the thread sleep for given time - time to cook the food
				 * Synchronized lock on listOffood
				 * remove the item from foodList
				 * notify all the foodList waiting to be processed
				 * 
				 * Synchronized lock on foodCompleted
				 * Add the food to the foodCompleted list
				 * notify all to intimate the cook that food is complete
				 * release the lock
				 * 
				 * 
				 */
			} catch(InterruptedException e) { }
		}
	}
 

	public String toString() {
		return machineName;
	}
}