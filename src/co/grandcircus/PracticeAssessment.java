package co.grandcircus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;

public class PracticeAssessment {
	
	public static HashMap<Integer, String> espanol() {
		HashMap<Integer, String> spanish = new HashMap<>();
		spanish.put(1, "Uno");
		spanish.put(2, "Dos");
		spanish.put(3, "Tres");
		
		return spanish;
	}
	
	public static int lift(List<String> strings) {
	    ListIterator<String> iterator = strings.listIterator(); //need ListIterator to go through each element
	    while (iterator.hasNext()) // loop through each element
	    {
	        iterator.set(iterator.next().toUpperCase()); //at each element make the word all upper case
	    }
		
		int currentIndex = 0;
		for (int i = 0; i < strings.size(); i++) {
			currentIndex = currentIndex + i;
		}
		return currentIndex;
	}
	
	public static boolean takeItAway(HashMap<String, String> map, String string) {
		//need to "copy" maps to list so that you have an index to iterate over
		ArrayList<String> keys = new ArrayList<>(map.keySet());
		
		for (String key : keys) {
			if (key.equals(string)) { 
				map.remove(key);
				return true;
			}
		}
		return false;
	}
	
	public static HashSet<String> listToSet(ArrayList<String> strings) {
		//copies list to set
		HashSet<String> stringSet = new HashSet<>(strings);
		return stringSet;
	}

	
	public static int howFarApart(ArrayList<String> strings, String string1, String string2) {
		
		int firstIndex = strings.indexOf(string1);
		int secondIndex = strings.indexOf(string2);
		int difference = secondIndex- firstIndex;
		
		return difference;
	}
	
}
