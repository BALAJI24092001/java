import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// Collections, Sets, Map and Generics

public class Day12{
	public static void main(String[] args) {
		Collection vals1 = new ArrayList<>();  // this is a collection interface storing reference of its derived class ArrayList
		// The advantage of this is, we can make the process of storing array data dynamically
		// While we didn't mention any data type of elements storing in it,
		// now it can store all data types. 
		// So we have to explicitly mention which data type to only allow store in it.
		// The order we can access the elements in this is the same order we added them

		Collection<Integer> vals2 = new ArrayList<>();
		Collection<Integer> vals3 = new ArrayList<>();

		Set<Integer> nums1 = new HashSet<>();
		// A Collection can have duplicate values, so we switch to Set type if we don't want duplicate values
		// The order we access the elements is random, with HashSet
		// The order we access the elements is sorted on the value of the elements(Ascending) with TreeSet
		

		Map< Integer, String > m = new HashMap<>();
		/*
		 *
		 * What up NewYork!!
		 * We will be what is up NewYork
		 * 
		 */
	}
}
