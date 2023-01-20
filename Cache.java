/**
 * Test/Driver class for Cache class
 * 
 * @author Harry Nguyen 
 *
 */

import java.util.LinkedList;

public class Cache<T> {
	
	private int playerSize; // size of the Cache
	public int hits; // number of hits 
	public int references; // number of references 
	private LinkedList<T> cache; // list to store the player information in cache 
	private long ellapsedTime;  
	
	// constructor 
	public Cache(int theSize) {
		hits = 0; 
		references = 0; 
		playerSize = theSize; 
		ellapsedTime = 0; 
		cache = new LinkedList<T>(); 
	}
	
	public void setEllapsedTime(long time) {
		ellapsedTime = time; 
	}

	public T getObject(T target) {
		for (T obj: cache) {
			if (obj.equals(target)) {
				return obj;
			}
		}
		return null;
	}

	public void addObject(T target) {
		
		if(playerSize == cache.size()) {
			cache.removeLast();
		}
		cache.addFirst(target);
	}

	public void removeCache(T target) {
		cache.remove(target);
	}

	public void clearCache() {
		cache.clear();
	}
	
	@Override
	public String toString() {
		// part of figure 1 in project 
		
		String stringOne ="~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
		String stringTwo ="LinkedList Cache with ";
		String stringThree = " entries has been created\n"
				+ "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
		String stringFour ="Total number of references:        ";
		String stringFive = "Total number of cache hits:        ";
		String stringSix = "1st-level cache hit ratio:         ";
		String stringSeven ="----------------------------------------------------------------\n";
		String stringEight ="Time elapsed: ";
		String stringNine = "\n----------------------------------------------------------------";
		
		String totalString = stringOne + stringTwo + playerSize + stringThree + stringFour + 
				references + "\n" + stringFive + hits + "\n" + stringSix +  hits * 1.0 / references 
				+ "\n" + stringSeven + stringEight + ellapsedTime * 1.0 + " milliseconds" + stringNine; 
		return totalString;	
	}
}